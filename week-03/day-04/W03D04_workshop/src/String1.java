/**
 * Created by danielszalay on 2017. 03. 30..
 */
public class String1 {
  public static void main(String[] args) {

    System.out.println(changeXtoY("Xavier index Szalax xoda Xoda"));
  }

  public static String changeXtoY (String word) {

    String stringMinusN = word.substring(0, word.length()-1);
    String lastLetter = word.substring(word.length()-1);
    if (lastLetter.equals("x")) lastLetter = "y";

    if (word.length() > 1) {
      return changeXtoY(stringMinusN) + lastLetter;
    }
    else {
      return lastLetter;
    }
  }
}
