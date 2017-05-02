package com.greenfoxacademy;

public class HelloInLanguage {
  String content;
  String color;
  String fontSize;

  public HelloInLanguage(String content, String color, String fontSize) {
    this.content = content;
    this.color = color;
    this.fontSize = fontSize;
  }

  public String getContent() {
    return this.content;
  }

  public String getFontSize() {
    return this.fontSize;
  }

  public String getColor() {
    return this.color;
  }
}
