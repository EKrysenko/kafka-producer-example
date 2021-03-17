package com.elcompanies.eventhubkafkaproducer.controller;

import com.elcompanies.eventhubkafkaproducer.message.AbstractProducerMessage;
import com.elcompanies.eventhubkafkaproducer.producer.KafkaMessageProducer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class SendMessageController {
    private KafkaMessageProducer producer;

    @PostMapping(value = "/send")
    public void sendMessage(@RequestBody AbstractProducerMessage message) {
        log.info("Received request /message/send with body {} ", message);
        producer.send(message);
    }
}
