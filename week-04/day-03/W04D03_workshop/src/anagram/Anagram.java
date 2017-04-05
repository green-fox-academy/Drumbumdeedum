package anagram;

import java.util.Arrays;

public class Anagram {
  String word1;
  String word2;

  public Anagram (String word1, String word2) {
    this.word1 = word1;
    this.word2 = word2;
  }

  public boolean checkAnagram () {
    String word1Lowercase = word1.toLowerCase();
    char[] chars1 = word1Lowercase.toCharArray();
    Arrays.sort(chars1);
    String sorted1 = new String(chars1);

    String word2Lowercase = word2.toLowerCase();
    char[] chars2 = word2Lowercase.toCharArray();
    Arrays.sort(chars2);
    String sorted2 = new String(chars2);

    return sorted1.equals(sorted2);
  }
}
