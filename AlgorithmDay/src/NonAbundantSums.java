public class NonAbundantSums {

  public static void main(String[] args) {

    long sum = 0;
    long start = 1;

    while (start <= 28123) {
      if (!sumOfTwoAbundantNumbers(start)) {
        System.out.println(start);
        sum += start;
      }
      start++;
    }

    System.out.println(sum);
  }

  public static Long sumOfDivisors(long input) {
    long sum = 0;
    for (long i = 1; i < input / 2 + 1; i++) {
      if (input % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static boolean perfectNumber(long input) {
    return sumOfDivisors(input) == input;
  }

  public static boolean abundantNumber(long input) {
    return sumOfDivisors(input) > input;
  }


  public static boolean deficientNumber(long input) {
    return sumOfDivisors(input) < input;
  }

  public static boolean sumOfTwoAbundantNumbers(long input) {
    boolean buffer = false;
    for (long i = 1; i < input; i++) {
      if (abundantNumber(i) && abundantNumber(input - i)) {
        buffer = true;
      }
    }
    return buffer;
  }
}
