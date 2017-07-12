public class EvenFibonacci {

  public static void main(String[] args) {
    long max = 4000000;
    System.out.println(sumOfEven(max));
  }

  private static long sumOfEven(long max) {
    long sum = 2;
    long fibOne = 1;
    long fibTwo = 2;
    long fibNext = 3;
    while (fibOne < max) {
      if (fibNext % 2 == 0) {
        sum += fibNext;
      }
      fibOne = fibTwo;
      fibTwo = fibNext;
      fibNext = fibOne + fibTwo;
    }
    return sum;
  }
}
