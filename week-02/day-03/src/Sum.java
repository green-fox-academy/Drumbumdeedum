/**
 * Created by danielszalay on 2017. 03. 22..
 */
//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter

public class Sum {
  public static void main(String[] args) {
    int maxValue = 6;
    System.out.println(sum(maxValue));
  }

  public static int sum(int value) {
    int sumValue = 0;
    for (int a = 0; a <= value; a++) {
      sumValue += a;
    }
    return sumValue;
  }
}
