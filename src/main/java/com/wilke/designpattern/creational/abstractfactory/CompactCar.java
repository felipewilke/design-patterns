package com.wilke.designpattern.creational.abstractfactory;

public class CompactCar extends Car {

  public CompactCar(Transmission transmission) {
    super(CarType.COMPACT, transmission);
  }

  @Override
  protected void specificConstruct() {
    System.out.println("specific compact car construct");

    // something specific
  }
}
