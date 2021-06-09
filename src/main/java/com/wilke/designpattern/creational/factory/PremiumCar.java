package com.wilke.designpattern.creational.factory;

public class PremiumCar extends Car {

  public PremiumCar() {
    super(CarType.PREMIUM);
    specificConstruct();
  }

  @Override
  protected void specificConstruct() {
    System.out.println("specific premium car construct");

    // something specific
  }
}
