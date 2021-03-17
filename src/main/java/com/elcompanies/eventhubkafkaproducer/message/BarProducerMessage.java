package com.elcompanies.eventhubkafkaproducer.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BarProducerMessage extends AbstractProducerMessage {
    private List<String> barNames;
}
