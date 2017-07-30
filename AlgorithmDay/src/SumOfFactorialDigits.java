import java.math.BigInteger;

public class SumOfFactorialDigits {

  public static void main(String[] args) {
    System.out.println("100! equals: " + factorialBigInt(100));
    System.out.println("Sum of digits: " + calcDigits(factorialBigInt(100).toString()));
  }

  public static BigInteger factorialBigInt(int input) {
    BigInteger fact = BigInteger.valueOf(1);
    for (int i = 1; i <= input; i++)
      fact = fact.multiply(BigInteger.valueOf(i));
    return fact;
  }

  private static int calcDigits(String s) {
    int sum = 0;

    for (int i = 0; i < s.length(); i++)
    {
      Character c = new Character(s.charAt(i));
      String z = c.toString();
      int j = Integer.parseInt(z);
      sum += j;
    }
    return sum;
  }
}
