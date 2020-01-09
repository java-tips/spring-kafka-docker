package com.spring.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Component
public class Producer {

    @Value("${topic.test}")
    private String topicTest;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(final @RequestBody String order) {
        final String mensageKey = UUID.randomUUID().toString();
        kafkaTemplate.send(topicTest, mensageKey, order);
    }
}