package com.greenfoxacademy.springpractice.model;

@SuppressWarnings("unused")
public class BankAccount {
  String name, animalType;
  int balance;
  boolean isKing, isBadGuy;

  public BankAccount(String name, String animalType, int balance, boolean isKing, boolean isBadGuy){
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
    this.balance = this.balance + 10;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isBadGuy() {
    return isBadGuy;
  }
}
