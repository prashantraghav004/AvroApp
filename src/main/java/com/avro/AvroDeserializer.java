package com.avro;

import java.util.Arrays;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvroDeserializer<T extends SpecificRecordBase> implements Deserializer<T> {

	private static final Logger LOGGER = LoggerFactory.getLogger(AvroDeserializer.class);

	private Class<T> clazz;

	public AvroDeserializer(Class<T> clazz) {
		this.clazz = clazz;
	}

	public AvroDeserializer() {

	}

	@Override
	public void close() {
		// No-op
	}

	public void addSchema(String id, Schema schema) {

	}

	@Override
	public void configure(Map<String, ?> arg0, boolean arg1) {

	}

	@SuppressWarnings("unchecked")
	@Override
	public T deserialize(String topic, byte[] data) {
		try {
			T result = null;

			if (data != null) {

				final Schema schema = ReflectData.AllowNull.get().getSchema(this.clazz);
				final DatumReader<GenericRecord> datumReader = new SpecificDatumReader<>(schema);
				Decoder // decoder = DecoderFactory.get().binaryDecoder(data, null);
				decoder = DecoderFactory.get().jsonDecoder(schema, new String(data));

				result = (T) datumReader.read(null, decoder);
			}
			return result;
		} catch (Exception ex) {
		LOGGER.error("Problem deserializing:{} For Topic:{} Error:{}. Message:{}", clazz.getName(), topic, ex.getMessage(), new String(data));
			throw new SerializationException(
					"Can't deserialize data '" + Arrays.toString(data) + "' from topic '" + topic + "'", ex);
		}
	}

}
