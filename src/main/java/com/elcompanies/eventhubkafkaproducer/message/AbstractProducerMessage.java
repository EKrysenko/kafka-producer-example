package com.elcompanies.eventhubkafkaproducer.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "messageType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FooProducerMessage.class, name = "FOO"),
        @JsonSubTypes.Type(value = BarProducerMessage.class, name = "BAR")
})
public abstract class AbstractProducerMessage {
    @JsonProperty("messageType")
    private MessageType messageType;

    public enum MessageType {
        FOO, BAR;
    }
}
