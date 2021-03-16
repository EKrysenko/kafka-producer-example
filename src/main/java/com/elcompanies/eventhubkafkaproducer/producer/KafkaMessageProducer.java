package com.elcompanies.eventhubkafkaproducer.producer;

import com.elcompanies.eventhubkafkaproducer.message.ProducerMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaMessageProducer {
    private final KafkaTemplate<String, ProducerMessage> kafkaTemplate;

    public void send(ProducerMessage producerMessage) {
        log.info("Published message to kafka queue: {}", producerMessage.getMessage());
        final String topic = kafkaTemplate.getDefaultTopic();
        final String key = "producer key";
//        final int partition = 0;
//        kafkaTemplate.send(topic, producerMessage.getPartition(), key, producerMessage);
        kafkaTemplate.send(topic, key, producerMessage);
    }
}
