package com.jsde.solacescs.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class SolacePublisher {

  private static final Logger LOG = LoggerFactory.getLogger(SolacePublisher.class);

  @Bean
  public Supplier<Message<String>> messagePublisher() {
    return () -> {
      try {
        LOG.info("Publishing message via messagePublisher Bean");
        Thread.sleep(3000);
        return MessageBuilder
            .withPayload("Message published by messagePublisher Bean")
            .setHeaderIfAbsent("custom_header1", "custom_value1")
            .build();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    };
  }

}
