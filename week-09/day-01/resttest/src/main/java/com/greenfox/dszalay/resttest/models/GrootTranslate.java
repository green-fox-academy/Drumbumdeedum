package com.greenfox.dszalay.resttest.models;

public class GrootTranslate {
  private String received, translated;

  public GrootTranslate(String message) {
    received = message;
    translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
