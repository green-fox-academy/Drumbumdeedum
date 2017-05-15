package com.greenfox.dszalay.resttest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import com.greenfox.dszalay.resttest.models.*;
import org.springframework.http.HttpStatus;

@RestController
public class GuardianController {

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public GuardianExceptions guardianError(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("message")) {
      return new GrootException("I am Groot!");
    } else {
      return new ArrowException("Missing distance or time parameter!");
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
}
