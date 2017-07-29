public class SumOfDigits {

  public static void main(String[] args) {
    System.out.println(sumOfDigits(toThePowerOf(2,1000)));
    System.out.println(toThePowerOf(2,1000));
  }

  public static long sumOfDigits(long inputNumber) {
    long result = 0;
    while (inputNumber != 0) {
      result += inputNumber % 10;
      inputNumber /= 10;
    }
    return result;
  }

  public static long toThePowerOf(long number, long power) {
    long multiplyBy = number;
    for (int i = 1; i < power; i++) {
      number *= multiplyBy;
    }
    return number;
  }
}
