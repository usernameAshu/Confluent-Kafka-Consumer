package com.ibm.tutorial.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.ibm.developer.confluent.json_model.JobDetailsPayload;

@Component
class AppMessageConsumer {
	@Value("${message.topic.name}")
	private String topicName;
	
	@Value("${message.topic.groupid}")
	private String groupId;
	
	private Log log = LogFactory.getLog(AppMessageConsumer.class);
	
	@KafkaListener(topics = {"${message.topic.name}"}, groupId = "${message.topic.groupid}" )
	public void consume(ConsumerRecord<Integer, JobDetailsPayload> record) {
		
		try {
			log.info("Consuming from Topic: correlation id: " +record.value().getCorrelationId());
		} catch (Exception e) {
			log.error("Error while consuming Kafka message");
		}
		
	}
	
}

//@Component
//class Consumer {
//	@Value("${message.topic.name}")
//	private String topicName;
//	
//	@Value("${message.topic.groupid}")
//	private String groupId;
//	
//	@KafkaListener(topics = {"${message.topic.name}"}, groupId = "${message.topic.groupid}" )
//	public void consume(ConsumerRecord<Integer, GameOfThrones> record) {
//		
//		try {
//			// String quote = record.value().getQuote().toString();
//			System.out.println("key = " + record.key() + ", Value = " + record);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//}