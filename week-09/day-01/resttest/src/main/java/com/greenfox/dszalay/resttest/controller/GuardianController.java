package com.greenfox.dszalay.resttest.controller;

import com.greenfox.dszalay.resttest.exceptionhandlers.ArrowException;
import com.greenfox.dszalay.resttest.exceptionhandlers.CargoException;
import com.greenfox.dszalay.resttest.exceptionhandlers.GrootException;
import com.greenfox.dszalay.resttest.exceptionhandlers.GuardianExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import com.greenfox.dszalay.resttest.models.*;
import org.springframework.http.HttpStatus;

@RestController
public class GuardianController {

  @Autowired
  CalorieTable draxTable;

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public GuardianExceptions guardianError(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("message")) {
      return new GrootException("I am Groot!");
    } else if (e.getParameterName().equals("distance") || e.getParameterName().equals("time")) {
      return new ArrowException("Missing distance or time parameter!");
    } else {
      return new CargoException("Please enter caliber and amount parameters!");
    }
  }

  @GetMapping("/groot")
  public GrootTranslate translate(@RequestParam String message) {
    return new GrootTranslate(message);
  }

  @GetMapping("/yondu")
  public Arrow arrow(@RequestParam double distance, @RequestParam double time) {
    return new Arrow(distance, time);
  }

  @GetMapping("/rocket")
  public Cargo cargo(Model model) {
    return new Cargo();
  }

  @GetMapping("/rocket/fill")
  public CargoStatus fillCargo(@RequestParam String caliber, @RequestParam int amount) {
    return new CargoStatus(caliber, amount);
  }

  @GetMapping("/drax")
  public CalorieTable draxTable() {
    return draxTable;
  }

  @GetMapping("/drax/addfood")
  public CalorieTable addFood(@RequestParam String name, @RequestParam int amount, @RequestParam int calories) {
    draxTable.addFood(name, amount, calories);
   return draxTable;
  }

  @GetMapping("/drax/remove")
  public CalorieTable removeFood(@RequestParam int index) {
    draxTable.removeFood(index);
    return draxTable;
  }

  @GetMapping("/drax/increaseamount")
  public CalorieTable increaseAmount(@RequestParam int index, @RequestParam int amount) {
    draxTable.updateFood(index,amount);
    return draxTable;
  }
}
