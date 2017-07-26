public class SumOfPrimesBelowTwoMillion {

  public static void main(String[] args) {
    long sum = 0;
    long maxValue = 2000000l;

    for (int i = 2; i < maxValue; i++) {
      if(NthPrimeNumber.isPrime(i)) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
