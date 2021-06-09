package com.wilke.designpattern.creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarFactoryTest {

  @Test
  void shouldCreateCars() {

    Car compactCar = CarFactory.create(CarType.COMPACT);
    assertThat(compactCar.getType()).isEqualTo(CarType.COMPACT);

    Car economyCar = CarFactory.create(CarType.ECONOMY);
    assertThat(economyCar.getType()).isEqualTo(CarType.ECONOMY);

    Car premiumCar = CarFactory.create(CarType.PREMIUM);
    assertThat(premiumCar.getType()).isEqualTo(CarType.PREMIUM);
  }
}
