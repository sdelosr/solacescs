package com.jsde.solacescs.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
public class AppEventPublisher {

  private static final Logger LOG = LoggerFactory.getLogger(AppEventPublisher.class);

  @Autowired
  private StreamBridge streamBridge;

  public void sendToExternalService(String message) {
    LOG.info(
        format("Sending message %s to appEventPublisher-out-0 destination",
            message));
    streamBridge.send("appEventPublisher-out-0",
        MessageBuilder.withPayload(message).build());
  }

}
