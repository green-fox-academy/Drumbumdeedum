package com.greenfox.dszalay.resttest.exceptionhandlers;

public class ArrowException implements GuardianExceptions {
  public String error;

  public ArrowException(String message) {
    this.error = message;
  }
}
