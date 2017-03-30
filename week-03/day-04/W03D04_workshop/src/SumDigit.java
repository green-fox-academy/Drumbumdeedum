public class SumDigit {

  public static void main(String[] args) {
    System.out.println(sumDigits(12645));
  }

  public static int sumDigits(int number) {
    // first get the 6 by, 126%10, then get 2 by 12%10, last get 1

    if (number < 10){
      return number;
    }
    else {
      int sum = (number%10) + sumDigits(number/10);
      return sum;
    }
  }
}
