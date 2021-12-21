package com.example.so70378200;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent> {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public void onApplicationEvent(ApplicationFailedEvent event) {
    logger.error("ApplicationFailed {} ", event);
    System.exit(1);
  }
}
