package com.elcompanies.eventhubkafkaproducer.producer;

import com.elcompanies.eventhubkafkaproducer.message.AbstractProducerMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaMessageProducer {
    private final KafkaTemplate<String, AbstractProducerMessage> kafkaTemplate;

    public void send(AbstractProducerMessage abstractProducerMessage) {
        log.info("Published message to kafka queue: {}", abstractProducerMessage);
        final String topic = kafkaTemplate.getDefaultTopic();
        final String key = "producer key";
//        final int partition = 0;
//        kafkaTemplate.send(topic, producerMessage.getPartition(), key, producerMessage);
        kafkaTemplate.send(topic, key, abstractProducerMessage);
    }
}
