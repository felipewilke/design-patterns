package com.wilke.designpattern.creational.factory;

public class EconomyCar extends Car {

  public EconomyCar() {
    super(CarType.ECONOMY);
  }

  @Override
  protected void specificConstruct() { 
      System.out.println("specific economy car construct");
      
      // something specific
  }
}
