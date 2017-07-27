public class DivisorsOfTriangleNumbers {

  public static void main(String[] args) {

    long number = 1;
    long divisors = 1;
    long currentHighestNumber = 1;

    while(divisors <= 500) {
      long triangleNumber = findNthTriangleNumber(number);
      long divisorsOfNumber = findNrOfDivisors(findNthTriangleNumber(number));
      if (divisorsOfNumber > divisors) {
        divisors = divisorsOfNumber;
        currentHighestNumber = triangleNumber;
      }
      number++;
    }
    System.out.println(currentHighestNumber + " has " + divisors + " divisors.");
  }

  public static long findNthTriangleNumber(long nthValue) {
    long value = 0;
    for (int i = 1; i <= nthValue; i++) {
      value += i;
    }
    return value;
  }

  public static long findNrOfDivisors(long number) {
    long divisors = 1;
    for (long i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        divisors++;
      }
    }
    return divisors;
  }
}
