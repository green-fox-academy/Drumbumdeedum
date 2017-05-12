public class KataOne {

  public static void main(String[] args) {
    String word1 = "doggie";
    String word2 = "dog";

    System.out.println(word1.contains(word2));
  }

  public static boolean anagramChecker(String word1, String word2) {
    if (word1 == null && word2 == null) {
      return false;
    }

    String word1NoWhitespace= "";
    String word2NoWhitespace= "";

    for (int i=0; i < word1.length(); i++) {
      if (!word1.substring(i,i+1).equals(" ")) {
        word1NoWhitespace += word1.substring(i,i+1);
      }
    }
    for (int i=0; i < word2.length(); i++) {
      if (!word2.substring(i,i+1).equals(" ")) {
        word2NoWhitespace += word2.substring(i,i+1);
      }
    }

    String word1Result = word1NoWhitespace.toLowerCase();
    String word2Result = word2NoWhitespace.toLowerCase();

    boolean isAnagram = true;

    for (int i=0; i < word1Result.length(); i++) {
      if (!word2Result.contains(word1Result.substring(i, i+1))) {
        isAnagram = false;
      }
    }
    if (word1Result.length() != word2Result.length()) {
      return false;
    }
    return isAnagram;
  }
}
