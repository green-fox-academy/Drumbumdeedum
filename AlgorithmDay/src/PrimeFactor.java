import java.util.ArrayList;

public class PrimeFactor {

  public static void main(String[] args) {
    long number = 600851475143l;
    System.out.println(largestPrimeFactor(3));

    for (long i = 1; i < 50; i++) {
      System.out.println("The biggest prime factor of " + i + " is: " + largestPrimeFactor(i));
    }
  }

  private static long largestPrimeFactor(long number) {
    ArrayList<Long> primeList = generatePrimeNumberFactorList(number);
    long largestFactor = 2;
    for (long element : primeList) {
      if (number % element == 0) {
        largestFactor = element;
      }
    }
    if (number % largestFactor == 0) {
      return largestFactor;
    } else {
      return number;
    }
  }

  private static ArrayList<Long> generatePrimeNumberFactorList(long max) {
    ArrayList<Long> primeNumbers = new ArrayList<>();
    primeNumbers.add(2l);
    long numberToAdd = 3l;
    while (numberToAdd <= max / 2) {
      if (!canBeDividedByElementInList(primeNumbers, numberToAdd) && max % numberToAdd == 0) {
        primeNumbers.add(numberToAdd);
      }
      numberToAdd++;
    }
    return primeNumbers;
  }

  private static boolean canBeDividedByElementInList(ArrayList<Long> list, long number) {
    for (long element : list ) {
      if (number % element == 0) {
        return true;
      }
    }
    return false;
  }
}
