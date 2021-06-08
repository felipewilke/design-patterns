package com.wilke.designpattern.creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LoggerTest {

  @Test
  void shouldGetUniqueLogInstance() {

    Logger loggerA = Logger.getInstance();
    Logger loggerB = Logger.getInstance();

    assertThat(loggerA).isEqualTo(loggerB);
  }
}
