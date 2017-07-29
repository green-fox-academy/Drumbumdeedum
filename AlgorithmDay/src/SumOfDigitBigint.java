import java.math.BigInteger;

public class SumOfDigitBigint {

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

  public static void main(String[] args) {
    long begin = System.currentTimeMillis();

    BigInteger number = BigInteger.valueOf(2);
    number = number.pow(1000);
    System.out.println(calcDigits(number.toString()));

    long end = System.currentTimeMillis();
    System.out.println(end - begin + "ms");
  }
}
