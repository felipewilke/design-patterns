package com.wilke.designpattern.creational.abstractfactory;

public class CarFactoryProducer {

  private CarFactoryProducer() {}

  public static CarFactory getFactory(Transmission transmission) {

    switch (transmission) {
      case MANUAL:
        return new ManualCarFactory();

      case AUTOMATIC:
        return new AutomaticCarFactory();

      default:
        throw new IllegalArgumentException("Invalid transmission: " + transmission);
    }
  }
}
