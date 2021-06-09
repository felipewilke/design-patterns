package com.wilke.designpattern.creational.builder;

public class Person {

  private String name;
  private String email;
  private Integer age;
  private Integer children;
  private String phone;
  private String address;

  private Person(PersonBuilder personBuilder) {
    super();
    this.name = personBuilder.name;
    this.email = personBuilder.email;
    this.age = personBuilder.age;
    this.children = personBuilder.children;
    this.phone = personBuilder.phone;
    this.address = personBuilder.address;
  }

  public static class PersonBuilder {
    private String name;
    private String email;
    private Integer age;
    private Integer children;
    private String phone;
    private String address;

    public PersonBuilder(String name) {
      this.name = name;
    }

    public PersonBuilder email(String email) {
      this.email = email;
      return this;
    }

    public PersonBuilder age(Integer age) {
      this.age = age;
      return this;
    }

    public PersonBuilder children(Integer children) {
      this.children = children;
      return this;
    }

    public PersonBuilder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public PersonBuilder address(String address) {
      this.address = address;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getChildren() {
    return children;
  }

  public void setChildren(Integer children) {
    this.children = children;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
