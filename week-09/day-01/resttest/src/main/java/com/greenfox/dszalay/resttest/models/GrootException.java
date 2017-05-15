package com.greenfox.dszalay.resttest.models;

public class GrootException implements GuardianExceptions {
  public String error;

  public GrootException(String message) {
    this.error = message;
  }
}
