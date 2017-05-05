package com.greenfox.tamafoxy.controller;

import com.greenfox.tamafoxy.Fox;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");

  @Autowired
  Fox foxy;

  @RequestMapping("/index.html")
  public String index(Model model) {
    model.addAttribute("foxy",foxy);
    return "index";
  }

  @RequestMapping("/nutritioncenter.html")
  public String nutritionCenter(Model model) {
    model.addAttribute("foxy",foxy);
    return "nutritioncenter";
  }

  @RequestMapping("/setnutrition")
  public String setnutrition(String food, String drink, Model model) {
    if (food.equals("")) {
      food = "\'add favourite food here\'";
    }
    if (drink.equals("")) {
      drink = "\'add favourite drink here\'";
    }

    if (!foxy.getFavouriteFood().toLowerCase().equals(food.toLowerCase()) && !food.equals("")) {
      foxy.addAction(LocalDate.now().toString() + " Food has been changed from: " + foxy.getFavouriteFood() + " to: " + food + ".");
    }
    if (!foxy.getFavouriteDrink().toLowerCase().equals(drink.toLowerCase()) && !drink.equals("")) {
      foxy.addAction(LocalDate.now().toString() + " Drink has been changed from: " + foxy.getFavouriteDrink() + " to: " + drink + ".");
    }

    foxy.setFavouriteDrink(drink);
    foxy.setFavouriteFood(food);
    model.addAttribute("foxy", foxy);
    return "nutritioncenter";
  }

  @RequestMapping("/trickcenter.html")
  public String trickCenter(Model model) {
    model.addAttribute("foxy",foxy);
    return "trickcenter";
  }

  @RequestMapping("/settrick")
  public String setTrick(String trick, Model model) {

    boolean doesNotContainTrick = true;

    for (int i=0; i < foxy.getTricks().size(); i++) {
      if (foxy.getTricks().get(i).toLowerCase().contains(trick.toLowerCase())) {
        doesNotContainTrick = false;
      }
    }
    if (doesNotContainTrick && trick != "" && foxy.getTricks().size() < 6) {
      foxy.addTrick(trick);
      foxy.addAction(LocalDate.now().toString() + " Learned to: " + trick);
    }
    if (foxy.getTricks().size() == 6) {
      foxy.addTrick("(max nr. of tricks learned)");
    }

    model.addAttribute("foxy", foxy);
    return "trickcenter";
  }

  @RequestMapping("/actionhistory.html")
  public String actionHistory(Model model) {
    model.addAttribute("foxy", foxy);
    return "actionhistory";
  }
}
