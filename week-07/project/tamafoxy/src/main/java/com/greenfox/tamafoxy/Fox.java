package com.greenfox.tamafoxy;

import java.util.ArrayList;

public class Fox {
  String name, favouriteFood, favouriteDrink;
  ArrayList<String> tricks;
  ArrayList<String> actionHistory;

  public Fox() {
    name = "Foxy Cent";
    favouriteFood = "Hamburgers";
    favouriteDrink = "Mango IceTea";
    tricks = new ArrayList<>();
    tricks.add("Code in Java");
    actionHistory = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public String getFavouriteDrink() {
    return favouriteDrink;
  }

  public void setFavouriteDrink(String favouriteDrink) {
    this.favouriteDrink = favouriteDrink;
  }

  public String getFavouriteFood() {
    return favouriteFood;
  }

  public void setFavouriteFood(String favouriteFood) {
    this.favouriteFood = favouriteFood;
  }

  public int getNumberOfTricks() {
    return this.tricks.size();
  }

  public void addTrick(String newTrick) {
    this.tricks.add(0, newTrick);
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public ArrayList<String> getActionHistory() {
    return actionHistory;
  }

  public void addAction(String action) {
    this.actionHistory.add(0, action);
  }

  public boolean actionHistoryEmpty() {
    boolean isEmpty = true;
    if (this.actionHistory.size() > 0) {
      isEmpty = false;
    }
    return isEmpty;
  }

  public String recentAction() {
    String status = "default";
    for (int i=0; i < tricks.size(); i++) {
      if (tricks.get(0).toLowerCase().equals("play the drums")) {
        status = "drum";
      }
    }
    for (int i=0; i < tricks.size(); i++) {
      if (tricks.get(0).toLowerCase().equals("play the guitar")) {
        status = "guitar";
      }
    }
    for (int i=0; i < tricks.size(); i++) {
      if (tricks.get(0).toLowerCase().equals("be a gangsta")) {
        status = "pimp";
      }
    }
    return status;
  }
}
