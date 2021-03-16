package com.elcompanies.eventhubkafkaproducer.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProducerMessage {
    private Integer processAtMinutes;
    private String message;
}
