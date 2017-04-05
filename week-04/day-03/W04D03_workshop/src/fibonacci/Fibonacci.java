package fibonacci;

public class Fibonacci {

  public int fibonacciN(int input) {
    if (input < 1) {
      return 0;
    } else if (input == 1 || input == 2) {
      return 1;
    } else {
      int elementValue = fibonacciN(input - 1) + fibonacciN(input - 2);
      return elementValue;
    }
  }
}

