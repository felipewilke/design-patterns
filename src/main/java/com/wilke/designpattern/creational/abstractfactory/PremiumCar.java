package com.wilke.designpattern.creational.abstractfactory;

public class PremiumCar extends Car {

  public PremiumCar(Transmission transmission) {
    super(CarType.PREMIUM, transmission);
    specificConstruct();
  }

  @Override
  protected void specificConstruct() {
    System.out.println("specific premium car construct");

    // something specific
  }
}
