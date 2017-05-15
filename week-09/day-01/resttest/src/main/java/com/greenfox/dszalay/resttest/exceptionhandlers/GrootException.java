package com.greenfox.dszalay.resttest.exceptionhandlers;

public class GrootException implements GuardianExceptions {
  public String error;

  public GrootException(String message) {
    this.error = message;
  }
}
