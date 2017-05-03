package com.greenfoxacademy;

public class HelloInLanguage {
  String content;
  String color;
  int fontSize;

  public HelloInLanguage(String content, String color, int fontSize) {
    this.content = content;
    this.color = color;
    this.fontSize = fontSize;
  }

  public String getContent() {
    return this.content;
  }

  public int getFontSize() {
    return this.fontSize;
  }

  public String getColor() {
    return this.color;
  }
}
