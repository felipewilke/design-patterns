package com.wilke.designpattern.creational.factory;

public abstract class Car {

  private CarType type;

  public Car(CarType type) {
    super();
    this.type = type;
    specificConstruct();
  }

  public CarType getType() {
    return type;
  }

  public void setType(CarType type) {
    this.type = type;
  }

  protected abstract void specificConstruct();
}
