public class String2 {
  public static void main(String[] args) {
    System.out.println(popX("Xavier index Szalax xoda Xoda"));
  }

  public static String popX (String wordInput) {

    String stringMinusN = wordInput.substring(0, wordInput.length()-1);
    String lastLetter = wordInput.substring(wordInput.length()-1);

    if (lastLetter.equals("x")) {
      lastLetter = "";
    }
    if (lastLetter.equals("X")) {
      lastLetter = "";
    }

    if (wordInput.length() > 1) {
      return popX(stringMinusN) + lastLetter;
    }
    else {
      return lastLetter;
    }
  }
}