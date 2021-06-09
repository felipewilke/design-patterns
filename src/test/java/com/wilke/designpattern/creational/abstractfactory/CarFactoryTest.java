package com.wilke.designpattern.creational.abstractfactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarFactoryTest {

  @Test
  void shouldCreateCars() {

    CarFactory manualCarFactory = CarFactoryProducer.getFactory(Transmission.MANUAL);
    Car compactCar = manualCarFactory.create(CarType.COMPACT);
    assertThat(compactCar.getType()).isEqualTo(CarType.COMPACT);
    assertThat(compactCar.getTransmission()).isEqualTo(Transmission.MANUAL);
    System.out.println(compactCar);

    Car economicCar = manualCarFactory.create(CarType.ECONOMY);
    assertThat(economicCar.getType()).isEqualTo(CarType.ECONOMY);
    assertThat(economicCar.getTransmission()).isEqualTo(Transmission.MANUAL);
    System.out.println(economicCar);

    Car manualPremiumCar = manualCarFactory.create(CarType.PREMIUM);
    assertThat(manualPremiumCar.getType()).isEqualTo(CarType.PREMIUM);
    assertThat(manualPremiumCar.getTransmission()).isEqualTo(Transmission.MANUAL);
    System.out.println(manualPremiumCar);

    CarFactory automaticCarFactory = CarFactoryProducer.getFactory(Transmission.AUTOMATIC);
    Car automaticPremiumCar = automaticCarFactory.create(CarType.PREMIUM);
    assertThat(automaticPremiumCar.getType()).isEqualTo(CarType.PREMIUM);
    assertThat(automaticPremiumCar.getTransmission()).isEqualTo(Transmission.AUTOMATIC);
    System.out.println(automaticPremiumCar);
  }
}
