package com.greenfoxacademy.springpractice.model;

public class BankAccount {
  String name, animalType, balance;
  boolean isKing;

  public BankAccount(String name, String animalType, String balance, boolean isKing){
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
    this.isKing = isKing;
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

  public boolean isKing() {
    return isKing;
  }
}
