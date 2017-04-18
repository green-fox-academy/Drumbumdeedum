public class Power {

  public static void main(String[] args) {
    System.out.println(toThePower(3,3));
    System.out.println(toThePower(3,4));
    System.out.println(toThePower(3, 5));
  }

  public static int toThePower(int number, int n) {
    if (n == 1) {
      return n * number;
    }
    else {
      int powered = (number * toThePower(number,n-1));
      return powered;
    }
  }
}
