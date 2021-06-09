package com.wilke.designpattern.creational.abstractfactory;

public class AutomaticCarFactory implements CarFactory {

  public Car create(CarType type) {
    switch (type) {
      case COMPACT:
        return new CompactCar(Transmission.AUTOMATIC);

      case ECONOMY:
        return new EconomyCar(Transmission.AUTOMATIC);

      case PREMIUM:
        return new PremiumCar(Transmission.AUTOMATIC);

      default:
        throw new IllegalArgumentException("Invalid car type: " + type);
    }
  }
}
