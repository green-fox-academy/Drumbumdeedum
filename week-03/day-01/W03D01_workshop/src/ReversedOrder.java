import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Created by danielszalay on 2017. 03. 28..
 */
public class ReversedOrder {

  public static void main(String[] args) {
    try {

      int lineCount = 0;
      HashMap <Integer, String> lineMap = new HashMap<Integer, String>();

      for (String line : Files.readAllLines(Paths.get("reversed-order.txt"))) {
        lineCount += 1;
        lineMap.put(lineCount, line);
      }

      for (int i=0; i < lineCount; i++) {
        System.out.println(lineMap.get(lineCount-i));
      }

    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
  }
}
