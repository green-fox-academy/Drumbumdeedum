public class RecursionPractice {

  public static void main(String[] args) {

    System.out.println(factorial(6));
    System.out.println();
    countDown(6);
    System.out.println();
    countUp(6);
  }

  public static int factorial(int i) {
    if (i == 1) {
      return 1;
    }
    else {
      return i * factorial(i-1);
    }
  }

  public static int countDown(int i) {
    System.out.println(i);
    if (i == 1) {
      return 1;
    }
    else {
      return countDown(i-1);
    }
  }

  public static int countUp(int i) {
    int j = i;
    if (i == 1) {
      return 1;
    }
    else {
      return countUp(i-1);
    }
  }
}
