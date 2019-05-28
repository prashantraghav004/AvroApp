package com.avaya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.config.YamlProcessor.MatchStatus;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.avaya.metam.messaging.schema.avro.conversationservice.event.MatchRequest;
import com.avaya.metam.messaging.schema.avro.conversationservice.event.state;
import com.avaya.metam.messaging.schema.avro.vrc.Attribute;
import com.avaya.metam.messaging.schema.avro.vrc.Resource;
import com.avaya.metam.messaging.schema.avro.vrc.ResourceData;
import com.avaya.metam.messaging.schema.avro.vrc.ResourceOffered;
import com.avaya.metam.messaging.schema.avro.vrc.Service;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import ch.qos.logback.classic.turbo.MatchingFilter;
@Component
public class SpringKafkaExample {
	
	public void sendMessage() {
		
		Map<String, Object> configProps = new HashMap<>();
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, AvroSerializer.class.getName());

		KafkaProducer<String,MatchRequest> kafkaproducer = new KafkaProducer<String, MatchRequest >(configProps);
		/*MatchRequest matchRequest = MatchRequest.newBuilder().setContextId("sushant").setMatchType("raghav")
				.setInteractionId("nitin").setCustomerId("parsai").setTaskType("jain").setWorkId("nilu")
				.setWorkRequestId("awas").build();*/
		Resource resource = new Resource();
		resource.setRank(1);
		//List <String>Al = new ArrayList<>();
		ResourceData resourcedata = new ResourceData();
		resourcedata.setAccountId(1);
		resourcedata.setChannelId("voice");
		resourcedata.setSourceName("Mankind");
		resource.setResourceData(resourcedata);
		
		Service service = new Service();
		service.setMaxProficiency("1");
		service.setMinProficiency("10");
		service.setPriority(1);
		service.setRank(5);
		service.setResourceCount("gvk");
		
		Attribute at = new Attribute();
		at.setCategory("edw");
		List<String> values = new LinkedList<>();
		values.add("chat");
		at.setValue("33232");
		service.setAttributes(at);
		
		ResourceOffered rc = new ResourceOffered();
		rc.setAccountId("123");
		rc.setAgentId("rewq");
		rc.setChannelId("212");
		rc.setChannelProvider("wqe");
		rc.setResourceAddress("ewq");
		rc.setSourceAddress("rewq");
		rc.setSourceName("wqe");
		service.setResourceOffered(rc);
		
		
		
		
		
		MatchRequest matchrequest = MatchRequest.newBuilder().setContextId("123").setCustomerId("32").setInteractionId("321").setMatchType("wert").setWorkId("ewq").setWorkRequestId("213").
				setTaskType("123").setResourceList(resource).setServiceList(service).setMatchingState(state.OFFERED).build();
		
		
	//	MatchRequest emp = MatchRequest.newBuilder().setOptions(list).
		//System.out.println("record generated is"+emp);

		String topic = "test4";
		ProducerRecord<String, MatchRequest> producerrecord = new ProducerRecord<String, MatchRequest>(topic,
				matchrequest);
		System.out.println("Produceroutput is"+ producerrecord);
		
		kafkaproducer.send(producerrecord);
		System.out.println("sent");
		
		
		
		//MessageCommand messageCommand = MessageCommand.newBuilder().build();
		/*com.avaya.metam.messaging.schema.avro.conversationservice.event.MatchRequest matchRequestL = 
				com.avaya.metam.messaging.schema.avro.conversationservice.event.MatchRequest.newBuilder().setContextId("123").
				setCustomerId("324").setInteractionId("543").setMatchType("frew").setTaskType("rewq").setWorkId("rewq").setWorkRequestId("wqert").build();*/
	}

	/*@KafkaListener(topics = "test4",groupId = "qwerty")
	public void receiveMessage(@Payload String message) {
		//System.out.println("!!! PRASHANT !!! " + this.re);
		System.out.println("Received Message=[" + message + "]");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(message);
		String prettyJsonString = gson.toJson(je);
		
		System.out.println("Preety String is :"+ prettyJsonString);
	}*/

}
