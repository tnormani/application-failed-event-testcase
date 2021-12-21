package com.example.so70378200;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

  @KafkaListener(topics = "test", groupId = "test")
  public void process(String message) {

  }
}
