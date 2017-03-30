public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(10));
  }

  public static int fibonacci (int input) {

    if (input == 1) {
      return 0;
    } else if (input == 2) {
      return 1;
    } else {
      return fibonacci(input-1) + fibonacci(input-2);
    }
  }
}
