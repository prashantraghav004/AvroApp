package com.avaya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.KafkaException;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.ContainerStoppingErrorHandler;
import org.springframework.kafka.listener.MessageListenerContainer;

import com.avro.AvroDeserializer;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

	private Map<String, Object> consumerConfigsAvro() {
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, AvroDeserializer.class);
		props.put(ConsumerConfig.GROUP_ID_CONFIG,"qwerty");

		return props;
	}

	@Bean
	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, MatchRequest>> messageEventListener() {
		return this.getAvroListenerFactory(MatchRequest.class, "messageEventListener");
	}

	private <T extends org.apache.avro.specific.SpecificRecordBase> KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, T>> getAvroListenerFactory(
			Class<T> clazz, String factoryName) {

		DefaultKafkaConsumerFactory<String, T> consumerfactory = new DefaultKafkaConsumerFactory<>(
				consumerConfigsAvro(), new StringDeserializer(), new AvroDeserializer<>(clazz));

		ConcurrentKafkaListenerContainerFactory<String, T> factory = new ConcurrentKafkaListenerContainerFactory<>();

		factory.setConsumerFactory(consumerfactory);
		factory.setErrorHandler(new SerializationExceptionHandler(factoryName));

		return factory;
	}

	// Handle Serialization Exception
	public class SerializationExceptionHandler extends ContainerStoppingErrorHandler {

		private String containerFactor;

		public SerializationExceptionHandler(String containerFactor) {
			this.containerFactor = containerFactor;
		}

		@Override
		public void handle(Exception thrownException, List<ConsumerRecord<?, ?>> records, Consumer<?, ?> consumer,
				MessageListenerContainer container) {

			if (thrownException instanceof SerializationException) {

				// Find alternative to string split of retrieving the record offset,
				// partition & topic from the handle method.
				String exceptionMessage = thrownException.getMessage()
						.split("Error deserializing key/value for partition ")[1]
								.split(". If needed, please seek past the record to continue consumption.")[0];
				String topics = exceptionMessage.split("-")[0];
				int offset = Integer.valueOf(exceptionMessage.split("offset ")[1]);
				int partition = Integer.valueOf(exceptionMessage.split("-")[1].split(" at")[0]);

				TopicPartition topicPartition = new TopicPartition(topics, partition);

				// seek next record
				consumer.seek(topicPartition, offset + 1);

			} else {
				// Wrap and re-throw the exception
				throw new KafkaException("Kafka Consumer Container Error", thrownException);
			}
		}
	}
}