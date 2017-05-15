package com.greenfox.dszalay.resttest.models;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class CalorieTable {
  ArrayList<Food> foodList;

  public CalorieTable() {
    foodList = new ArrayList<>();
  }

  public ArrayList<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(ArrayList<Food> foodList) {
    this.foodList = foodList;
  }

  public void addFood(String name, int amount, int calories) {
    foodList.add(new Food(name, amount, calories));
  }

  public void removeFood(int index) {
    foodList.remove(index);
  }

  public void updateFood(int index, int amount) {
    foodList.get(index).setAmount(amount);
  }
}
