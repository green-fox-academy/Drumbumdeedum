/**
 * Created by danielszalay on 2017. 03. 24..
 */

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a word:");
    String word1 = scanner.nextLine();

    System.out.println("Please enter another word, to see if it's and anagram of the first word:");
    String word2 = scanner.nextLine();

    isAnagram(word1, word2);
  }

  public static void isAnagram (String word1, String word2) {

    String word1Lowercase = word1.toLowerCase();
    char[] chars1 = word1Lowercase.toCharArray();
    Arrays.sort(chars1);
    String sorted1 = new String(chars1);

    String word2Lowercase = word2.toLowerCase();
    char[] chars2 = word2Lowercase.toCharArray();
    Arrays.sort(chars2);
    String sorted2 = new String(chars2);

    int word1Length = sorted1.length();
    int word2Length = sorted2.length();

    if (sorted1.equals(sorted2) == true && word1Length == word2Length) {
      System.out.println("It's and annagram!");
    } else if (sorted1.equals(sorted2) == false && word1Length == word2Length) {
      System.out.println("It's not and annagram!");
    } else {
      System.out.println("The words should have the same amount of letters!");
    }
  }
}