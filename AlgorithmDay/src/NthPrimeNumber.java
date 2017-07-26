public class NthPrimeNumber {

  public static void main(String[] args) {

    System.out.println(getNthPrime(10001));
  }

  public static boolean isPrime(long num) {
    if (num < 2) {
      return false;
    }
    if (num == 2) {
      return true;
    }
    if (num % 2 == 0) {
      return false;
    }
    for (int i = 3; i * i <= num; i += 2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static long getNthPrime(int elementNr) {
    long elementIndex = 1;
    long elementValue = 2;

    while (elementIndex < elementNr) {
      elementValue ++;
      if (isPrime(elementValue)) {
        elementIndex++;
      }
    }
    return elementValue;
  }
}

