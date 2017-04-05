package sum;

import java.util.ArrayList;

public class Sum {
  private ArrayList<Integer> list;

  public Sum(ArrayList<Integer> inputList) {
    list = new ArrayList<>();

    for (int number : inputList) {
      list.add(number);
    }
  }

  public int sumNumbers() {
    int sumValue = 0;

    for (int number : list) {
      sumValue += number;
    }
    return sumValue;
  }
}