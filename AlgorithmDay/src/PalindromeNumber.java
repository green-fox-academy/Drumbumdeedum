import java.util.Arrays;

public class PalindromeNumber {

  public static void main(String[] args) {
    int biggestPalindrome = 0;
    for (int i = 100; i <= 999; i++) {
      for (int j = 100; j <= 999 ; j++) {
        if (isItAPalindromeNumber(i*j) && i*j > biggestPalindrome) {
          biggestPalindrome = i*j;
        }
      }
    }
    System.out.println(biggestPalindrome);
  }

  public static boolean isItAPalindromeNumber (int number) {
    String numberString = Integer.toString(number);
    String firstHalf = "";
    String secondHalf = "";
    for (int i = 0; i < numberString.length()/2; i++) {
      firstHalf += (numberString.charAt(i));
      secondHalf += (numberString.charAt(numberString.length()-1-i));
    }
    return firstHalf.equals(secondHalf);
  }
}
