package com.greenfox.w08d03.models;

import org.springframework.stereotype.Component;

@Component
public class ErrorHandler {
  String error;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

}
