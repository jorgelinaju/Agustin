package com.oop.examples.inheritance;

public class Bird extends Animal {
  private String species;

  public Bird(String name, int age, String species) {
    super(name, age);
    this.species = species;
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " says: Tweet tweet!");
  }

  public void fly() {
    System.out.println(getName() + " is flying!");
  }

  public String getSpecies() {
    return species;
  }
}
