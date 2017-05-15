package com.greenfox.dszalay.resttest.models;

/**
 * Created by danielszalay on 2017. 05. 15..
 */
public class ArrowException implements GuardianExceptions {
  public String error;

  public ArrowException(String message) {
    this.error = message;
  }
}
