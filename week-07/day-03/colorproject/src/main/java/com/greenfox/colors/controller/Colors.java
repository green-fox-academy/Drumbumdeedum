package com.greenfox.colors.controller;

import com.greenfox.colors.models.MyColor;
import org.springframework.stereotype.Controller;

@Controller
public class Colors implements MyColor {
  public String color;

  @Override
  public void printColor() {
    System.out.println("The color is: " + this.color);
  }
}
