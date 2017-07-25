public class SumSquareDifference {

  public static void main(String[] args) {
    System.out.println(sumSquareDiff(100));
  }

  public static long sumSquareDiff(long maxValue) {
    return squareOfSums(maxValue) - sumOfSquares(maxValue);
  }

  public static long sumOfSquares(long maxValue) {
    long sum = 0;
    for (int i = 1; i <= maxValue; i++) {
      sum += (i*i);
    }
    return sum;
  }

  public static long squareOfSums(long maxValue) {
    long sum = 0;
    for (int i = 1; i <= maxValue; i++) {
      sum += i;
    }
    return sum*sum;
  }
}
