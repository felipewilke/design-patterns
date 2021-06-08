package com.wilke.designpattern.creational.builder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class PersonBuilderTest {

  @Test
  void shouldBuildPerson() {

    // Avoid complex constructor
    /* Person joao = new Person("joao silva", null, 20, null, "51999999", null);
    Person maria =
        new Person("maria santos", "mariasantos@email.com", null, 1, null, "street abc 123");
    Person carlos = new Person("carlos pires", null, null, null, null, null);*/

    Person joao = new Person.PersonBuilder("joao silva").age(20).phone("51999999").build();
    Person maria =
        new Person.PersonBuilder("maria santos")
            .email("mariasantos@email.com")
            .children(1)
            .address("street abc 123")
            .build();
    Person carlos = new Person.PersonBuilder("carlos pires").build();

    assertAll(
        () -> assertThat(joao.getName()).isEqualTo("joao silva"),
        () -> assertThat(joao.getEmail()).isNull(),
        () -> assertThat(joao.getAge()).isEqualTo(20),
        () -> assertThat(joao.getChildren()).isNull(),
        () -> assertThat(joao.getPhone()).isEqualTo("51999999"),
        () -> assertThat(joao.getAddress()).isNull());

    assertAll(
        () -> assertThat(maria.getName()).isEqualTo("maria santos"),
        () -> assertThat(maria.getEmail()).isEqualTo("mariasantos@email.com"),
        () -> assertThat(maria.getAge()).isNull(),
        () -> assertThat(maria.getChildren()).isEqualTo(1),
        () -> assertThat(maria.getPhone()).isNull(),
        () -> assertThat(maria.getAddress()).isEqualTo("street abc 123"));

    assertAll(
        () -> assertThat(carlos.getName()).isEqualTo("carlos pires"),
        () -> assertThat(carlos.getEmail()).isNull(),
        () -> assertThat(carlos.getAge()).isNull(),
        () -> assertThat(carlos.getChildren()).isNull(),
        () -> assertThat(carlos.getPhone()).isNull(),
        () -> assertThat(carlos.getAddress()).isNull());
  }
}
