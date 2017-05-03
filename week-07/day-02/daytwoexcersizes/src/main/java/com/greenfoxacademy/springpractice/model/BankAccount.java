package com.greenfoxacademy.springpractice.model;

public class BankAccount {
  String name, animalType, balance;

  public BankAccount(String name, String animalType, String balance){
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBalance() {
    return balance;
  }
}
