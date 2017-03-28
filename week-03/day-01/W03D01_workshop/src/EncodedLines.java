import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by danielszalay on 2017. 03. 28..
 */
public class EncodedLines {

  public static void main(String[] args) {
    try {


      for (String line : Files.readAllLines(Paths.get("encoded-lines.txt"))) {
        if (line != null) {

          String encoded = "";

          String abcNormal = "zabcdefghijklmnopqrstuvwxyz";
          String abcVarial = "abcdefghijklmnopqrstuvwxyza";

          for (int i=0; i < line.length(); i++) {
            String letter = line.substring(i, i+1).toLowerCase();
            if (abcNormal.contains(letter) == true) {
              encoded = encoded + abcNormal.substring(abcVarial.indexOf(letter), abcVarial.indexOf(letter)+1);
            } else if (abcNormal.contains(letter) == false){
              encoded = encoded + letter;
            }
          }

          System.out.println(encoded);
        }
      }

    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
  }
}
