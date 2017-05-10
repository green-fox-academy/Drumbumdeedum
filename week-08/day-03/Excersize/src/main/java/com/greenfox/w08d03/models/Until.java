package com.greenfox.w08d03.models;

import org.springframework.stereotype.Component;

@Component
public class Until {
  int until;

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
