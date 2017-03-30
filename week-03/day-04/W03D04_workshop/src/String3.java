public class String3 {
  public static void main(String[] args) {
    System.out.println(addStars("This sentence contains no stars."));
  }
  public static String addStars (String wordInput) {
    if (wordInput.length() == 1) {
      return wordInput;
    }
    else {
      return wordInput.charAt(0) + "*" + addStars(wordInput.substring(1, wordInput.length()));
    }
  }
}
