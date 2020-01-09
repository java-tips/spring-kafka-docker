package com.spring.kafka.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "${topic.test}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(String test) {
        System.out.println("test: " + test);
    }

}
