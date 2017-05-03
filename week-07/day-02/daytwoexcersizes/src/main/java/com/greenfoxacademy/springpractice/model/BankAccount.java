package com.greenfoxacademy.springpractice.model;

public class BankAccount {
  String name, animalType;
  long balance;
  boolean isKing, isBadGuy;

  public BankAccount(String name, String animalType, long balance, boolean isKing, boolean isBadGuy){
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
    this.isKing = isKing;
    this.isBadGuy = isBadGuy;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance() {
    this.balance += 10;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isBadGuy() {
    return isBadGuy;
  }
}
