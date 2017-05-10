package com.greenfox.w08d03.controllers;

import com.greenfox.w08d03.models.Append;
import com.greenfox.w08d03.models.DoUntil;
import com.greenfox.w08d03.models.Doubling;
import com.greenfox.w08d03.models.ErrorHandler;
import com.greenfox.w08d03.models.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcersizeRestController {

  @Autowired
  ErrorHandler handler;

  @Autowired
  Doubling doubled;

  @Autowired
  Greeter greeter;

  @Autowired
  Append append;

  @Autowired
  DoUntil doUntil;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorHandler handler(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("input")) {
      handler.setError("Please provide an " + e.getParameterName() + "!");
    }
    if (e.getParameterName().equals("name")) {
      handler.setError("Please provide a " + e.getParameterName() + "!");
    }
    if (e.getParameterName().equals("title")) {
      handler.setError("Please provide a " + e.getParameterName() + "!");
    }
    return handler;
  }

  @GetMapping("/doubling")
  public Doubling doubled(@RequestParam() int input) {
    doubled.setReceived(input);
    doubled.setResult(input*2);
    return doubled;
  }

  @GetMapping("/greeter")
  public Greeter greeter(@RequestParam() String name, @RequestParam String title) {
    greeter.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    return greeter;
  }

  @GetMapping("/appenda/{appendable}")
  public Append append(@PathVariable() String appendable) {
    append.setAppended(appendable.concat("a"));
    return append;
  }

  @PostMapping("/dountil/{what}")
  public DoUntil doUntil(@PathVariable() String what, @RequestBody int number) {

    return doUntil;
  }
}
