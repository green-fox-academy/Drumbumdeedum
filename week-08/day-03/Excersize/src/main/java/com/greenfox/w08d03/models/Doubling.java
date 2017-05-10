package com.greenfox.w08d03.models;

import org.springframework.stereotype.Component;

@Component
public class Doubling {
  int received;
  int result;
  String error;

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
