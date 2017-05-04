package com.greenfoxacademy.helloworld;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorld {
  private String message;

  public void setMessage(String message){
    this.message  = message;
  }

  public String getMessage(){
    System.out.println("Your message: " + message);
    return message;
  }
}
