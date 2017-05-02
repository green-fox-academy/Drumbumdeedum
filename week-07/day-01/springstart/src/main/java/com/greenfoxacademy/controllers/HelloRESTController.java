package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  Greeting greeting;
  private static final String GREET = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String content) {
    greeting = new Greeting(counter.incrementAndGet(), String.format(GREET, content));
    return greeting;
  }
}
