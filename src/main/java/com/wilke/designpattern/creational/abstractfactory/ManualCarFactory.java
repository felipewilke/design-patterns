package com.wilke.designpattern.creational.abstractfactory;

public class ManualCarFactory implements CarFactory {

  public Car create(CarType type) {
    switch (type) {
      case COMPACT:
        return new CompactCar(Transmission.MANUAL);

      case ECONOMY:
        return new EconomyCar(Transmission.MANUAL);

      case PREMIUM:
        return new PremiumCar(Transmission.MANUAL);

      default:
        throw new IllegalArgumentException("Invalid car type: " + type);
    }
  }
}
