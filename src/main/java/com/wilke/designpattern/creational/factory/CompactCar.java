package com.wilke.designpattern.creational.factory;

public class CompactCar extends Car {

  public CompactCar() {
    super(CarType.COMPACT);
    specificConstruct();
  }

  @Override
  protected void specificConstruct() {
    System.out.println("specific compact car construct");

    // something specific
  }
}
