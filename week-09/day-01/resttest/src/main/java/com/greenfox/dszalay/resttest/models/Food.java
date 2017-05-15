package com.greenfox.dszalay.resttest.models;

public class Food {
  String name;
  int amount, calories;

  public Food(String name, int amount, int calories) {
    this.name = name;
    this.amount = amount;
    this.calories = calories;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}
