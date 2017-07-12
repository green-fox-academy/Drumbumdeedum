public class MultiplesOfThreeAndFive {

  public static void main(String[] args) {
    int max = 1000;
    System.out.println(sumOfMultiples(max));
  }

  private static int sumOfMultiples(int max) {
    int sum = 0;
    for (int i = 0; i < max; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
