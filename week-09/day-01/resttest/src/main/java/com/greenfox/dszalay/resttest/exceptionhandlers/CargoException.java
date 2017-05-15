package com.greenfox.dszalay.resttest.exceptionhandlers;

public class CargoException implements GuardianExceptions {

  public String error;

  public CargoException(String message) {
    this.error = message;
  }
}
