package com.greenfox.w08d03.controllers;

import com.greenfox.w08d03.models.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;

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

  @Autowired
  ArrayHandler arrayHandler;

  @Autowired
  ArrayHandlerResult arrayHandlerResult;

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

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorHandler handler2(){
    handler.setError("Please provide a number!");
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
  public DoUntil doUntil(@PathVariable() String what, @RequestBody Until until) {

    if (what.equals("sum")){
      int result = 0;
      for (int i=0; i <= until.getUntil(); i++) {
        result += i;
      }
      doUntil.setResult(result);
    }

    if (what.equals("factor")){
      int result = 1;
      for (int i=1; i <= until.getUntil(); i++) {
        result *= i;
      }
      doUntil.setResult(result);
    }
    return doUntil;
  }

  @PostMapping("/arrays")
  public ArrayHandlerResult arrayHandler(@RequestBody ArrayHandler handler) {

    if(handler.getWhat().equals("sum")) {
      int result = 0;
      for (int i=0; i < handler.getNumbers().length ; i++) {
        result += handler.getNumbersOfArray(i);
      }
      arrayHandlerResult.setResult(result);
    }
    if(handler.getWhat().equals("multiply")) {
      int result = 1;
      for (int i=0; i < handler.getNumbers().length ; i++) {
        result *= handler.getNumbersOfArray(i);
      }
      arrayHandlerResult.setResult(result);
    }
    if(handler.getWhat().equals("double")) {
      int result = 0;
      for (int i=0; i < handler.getNumbers().length ; i++) {
        handler.getNumbers()[i] = handler.getNumbersOfArray(i*2);
      }
      arrayHandlerResult.setResult(result);
    }
  return arrayHandlerResult;
  }
}
