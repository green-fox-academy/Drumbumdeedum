import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by danielszalay on 2017. 03. 28..
 */
public class ReversedLines {

  public static void main(String[] args) {
    try {
      for (String line : Files.readAllLines(Paths.get("reversed-lines.txt"))) {
        if (line != null) {


          line = line + " ";

          String reversedLine = "";

          for (int i=0; i < line.length(); i++) {
            reversedLine += line.substring(line.length()-i-1, line.length()-i);
          }

          System.out.println(reversedLine.trim());
        }
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
  }
}
