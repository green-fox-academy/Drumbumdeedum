public class SmallestMultiple {

  public static void main(String[] args) {
    System.out.println(smallestMultipleUpTo(20));
  }

  public static long smallestMultipleUpTo(long maxValue) {
    long result = 0;
    for (int i = 1; i <= multiples(maxValue); i++) {
      if (isDividableByAll(i, maxValue)) {
        result = i;
        break;
      }
    }
    return result;
  }

  public static boolean isDividableByAll(long numberToDivide, long maxValue) {
    boolean buffer = true;
    for (int i = 1; i <= maxValue; i++) {
      if (numberToDivide % i != 0) {
        buffer = false;
      }
    }
    return buffer;
  }

  public static long multiples(long value) {
    long result = 1;
    for (int i =1 ; i <= value; i++) {
      result *= i;
    }
    return result;
  }
}
