/**
 * Created by danielszalay on 2017. 03. 28..
 */
public class test {

  public static void main(String[] args) {

    String line = "Fodpef uijt.";

    String encoded = "";

    String abcNormal = "zabcdefghijklmnopqrstuvwxyz";
    String abcVarial = "abcdefghijklmnopqrstuvwxyza";

    for (int i=0; i < line.length(); i++) {
      String letter = line.substring(i, i+1).toLowerCase();
      if (abcNormal.contains(letter)) {
        encoded = encoded + abcNormal.substring(abcVarial.indexOf(letter), abcVarial.indexOf(letter)+1);
      } else {
        encoded = encoded + letter;
      }
    }

    System.out.println(encoded);



  }

}
