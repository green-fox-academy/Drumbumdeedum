import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by danielszalay on 2017. 03. 28..
 */

public class Doubled {
  public static void main(String[] args) {

    try {
      for (String line : Files.readAllLines(Paths.get("duplicated-chars.txt"))) {
        if (line != null) {

          String doubledLine = line;
          String singledLine = "";

          for (int i=0; i < doubledLine.length(); i += 2) {
            singledLine += doubledLine.substring(i, i+1);
          }

          System.out.println(singledLine);
        }
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }

  }
}
