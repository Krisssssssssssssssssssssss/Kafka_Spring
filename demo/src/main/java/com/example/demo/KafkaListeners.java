package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//Who listens to what?
@Component
public class KafkaListeners {
    @KafkaListener(topics = "testTopic", groupId = "products")
    void listener (String data) {
        System.out.println("Listener recieved: " + data + " HORAY!!");
    }
}
