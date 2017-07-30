public class AmicableNumbers {

  public static void main(String[] args) {

    int sum = 0;

    for (int i = 1; i < 10000; i++) {
      for (int j = 1; j < 10000; j++) {
        if (amicableNumbers(i, j)) {
          System.out.println(i);
          sum += i;
        }
      }
    }
    System.out.println(sum);
  }

  public static Integer sumOfDivisors(int input) {
    int sum = 0;
    for (int i = 1; i < input / 2 + 1; i++) {
      if (input % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static boolean amicableNumbers(int input1, int input2) {
    boolean buffer = true;
    if (input1 != sumOfDivisors(input2) || input2 != sumOfDivisors(input1) || input1 == input2) {
      buffer = false;
    }
    return buffer;
  }
}
