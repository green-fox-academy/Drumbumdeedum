package sum;

import java.util.ArrayList;

public class Sum {
  private ArrayList<Integer> list;

  public Sum() {
    list = new ArrayList<>();
    list.add(null);
  }

  public int sumNumbers() {
    int sumValue = 0;

    if (list.get(0) != null) {
      for (int i = 0; i < list.size(); i++) {
        sumValue += list.get(i);
      }
      return sumValue;
    } else {
      return 0;
    }
  }
}