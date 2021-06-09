package com.wilke.designpattern.creational.abstractfactory;

public class EconomyCar extends Car {

  public EconomyCar(Transmission transmission) {
    super(CarType.ECONOMY, transmission);
    specificConstruct();
  }

  @Override
  protected void specificConstruct() { 
      System.out.println("specific economy car construct");
      
      // something specific
  }
}
