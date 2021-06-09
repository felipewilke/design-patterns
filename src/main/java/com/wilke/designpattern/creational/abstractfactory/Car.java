package com.wilke.designpattern.creational.abstractfactory;

public abstract class Car {

  private CarType type;
  private Transmission transmission;

  public Car(CarType type, Transmission transmission) {
    super();
    this.type = type;
    this.transmission = transmission;
    specificConstruct();
  }

  public CarType getType() {
    return type;
  }

  public void setType(CarType type) {
    this.type = type;
  }

  public Transmission getTransmission() {
    return transmission;
  }

  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  protected abstract void specificConstruct();

  @Override
  public String toString() {
    return "Car [type=" + type + ", transmission=" + transmission + "]";
  }
}
