public class String3 {
  public static void main(String[] args) {
    System.out.println(addStars("This sentence contains no stars."));
  }

  public static String addStars (String wordInput) {

    String stringMinusN = wordInput.substring(0, wordInput.length()-1);
    String lastLetter = wordInput.substring(wordInput.length()-1);

    lastLetter = lastLetter + "*";

    if (wordInput.length() > 1) {
      return addStars(stringMinusN) + lastLetter;
    }
    else {
      return lastLetter;
    }
  }
}
