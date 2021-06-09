package com.wilke.designpattern.creational.factory;

public class CarFactory {

  private CarFactory() {}

  public static Car create(CarType type) {
    switch (type) {
      case COMPACT:
        return new CompactCar();

      case ECONOMY:
        return new EconomyCar();

      case PREMIUM:
        return new PremiumCar();

      default:
        throw new IllegalArgumentException("Invalid car type: " + type);
    }
  }
}
