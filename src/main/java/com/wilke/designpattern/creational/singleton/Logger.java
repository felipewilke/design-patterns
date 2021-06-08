package com.wilke.designpattern.creational.singleton;

public class Logger {

  private static boolean initialized = false;

  private static Logger instance;

  private Logger() {}

  private void init() {
    // do something
  }

  public static synchronized Logger getInstance() {
    if (initialized) {
      return instance;
    }

    instance = new Logger();

    instance.init();
    initialized = true;

    return instance;
  }

  public void log(String text) {
    // do something
  }
}
