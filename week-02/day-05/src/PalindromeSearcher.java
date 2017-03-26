/**
 * Created by danielszalay on 2017. 03. 24..
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSearcher {

  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Please enter a word:");
    String userInput = scanner.nextLine();

    // String sampleWord: "dog goat dad duck doodle never";

    System.out.println(searchPalindrome(userInput));
  }

  public static ArrayList searchPalindrome(String word) {

    ArrayList<String> palindromeList = new ArrayList<>();

      for (int startingIndex = 0; word.length()-startingIndex >= 3; startingIndex++) {
        for (int addToWordLength = 0; startingIndex + addToWordLength < word.length()-2;
          addToWordLength++) {

          String checkword = word.substring(startingIndex, startingIndex + 3 + addToWordLength);

          if (isPalindrome(checkword).equals("true")) {
            palindromeList.add("\"" + checkword + "\"");
          }
        }
      }
    return palindromeList;
  }

  public static String isPalindrome(String checkWordAnyCase) {

    String checkWord = checkWordAnyCase.toLowerCase();

    int wordLength = checkWord.length();

    if ((wordLength % 2) == 0) {

      int wordHalf = checkWord.length() / 2;

      String firstHalf = checkWord.substring(0, wordHalf);
      String secondHalf = checkWord.substring(wordHalf);

      String reversedSecondHalf = "";

      for (int i = 0; i < secondHalf.length(); i++) {
        reversedSecondHalf += secondHalf.charAt(secondHalf.length() - 1 - i);
      }

      if (firstHalf.equals(reversedSecondHalf)) {
        return "true";
      } else {
        return "false";

      }
    }
    else {

      int wordHalf = checkWord.length() / 2;

      String firstHalf = checkWord.substring(0, wordHalf);
      String secondHalf = checkWord.substring(wordHalf+1);

      String reversedSecondHalf = "";

      for (int i = 0; i < secondHalf.length(); i++) {
        reversedSecondHalf += secondHalf.charAt(secondHalf.length() - 1 - i);
      }

      if (firstHalf.equals(reversedSecondHalf)) {
        return "true";
      } else {
        return "false";
      }
    }
  }
}