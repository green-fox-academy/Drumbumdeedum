package com.greenfox.w08d03.models;

import org.springframework.stereotype.Component;

@Component
public class ArrayHandler {
  String what;
  int [] numbers;

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public int getNumbersOfArray(int index) {
    return this.numbers[index];
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
