/**
 * Created by danielszalay on 2017. 03. 24..
 */

import java.util.Scanner;

public class PalindromeBuilder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Please enter a word:");
    String userInput = scanner.nextLine();

    System.out.println(createPalindrome(userInput));
  }

  public static String createPalindrome(String word) {

    String reversedInput = "";

    for (int i = 0; i < word.length(); i++) {
      reversedInput += word.charAt(word.length()-1-i);
    }
    return word + reversedInput;
  }
}
