package com.wilke.designpattern.creational.abstractfactory;

public interface CarFactory {

  public abstract Car create(CarType type);
}
