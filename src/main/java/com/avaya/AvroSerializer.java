package com.avaya;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.ConsumerFactory;

public class AvroSerializer<T extends SpecificRecordBase> implements Serializer<T> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AvroSerializer.class);

	@Override
	public void close() {
	}

	@Override
	public void configure(Map<String, ?> arg0, boolean arg1) {
	}

	@Override
	public byte[] serialize(String topic, T data) {
		
		
		try {
			byte[] result = null;

			if (data != null) {
				LOGGER.debug("data='{}'", data);

				final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				Encoder // encoder = EncoderFactory.get().binaryEncoder(outputStream, null);
				encoder = EncoderFactory.get().jsonEncoder(data.getSchema(), outputStream);

				DatumWriter<GenericRecord> datumWriter = new ReflectDatumWriter<>(data.getSchema());
				datumWriter.write(data, encoder);

				encoder.flush();
				outputStream.close();

				result = outputStream.toByteArray();
				LOGGER.debug("serialized data='{}'", DatatypeConverter.printHexBinary(result));
			}
			return result;
		} catch (IOException ex) {
			LOGGER.error("Problem deserializing:{} For Topic:{} Error:{}", data.getClass().getName(), topic,
					ex.getMessage());

			throw new SerializationException("Can't serialize data='" + data + "' for topic='" + topic + "'", ex);
		}
	}

}