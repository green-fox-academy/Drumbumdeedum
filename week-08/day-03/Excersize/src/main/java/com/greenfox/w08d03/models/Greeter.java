package com.greenfox.w08d03.models;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
  String welcome_message;
  String error;

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
