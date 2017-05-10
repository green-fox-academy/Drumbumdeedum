package com.greenfox.w08d03.models;

import org.springframework.stereotype.Component;

@Component
public class Append {
  String appended;

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
