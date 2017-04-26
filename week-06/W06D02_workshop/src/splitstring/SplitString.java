package splitstring;

import java.util.ArrayList;
import java.util.List;

public class SplitString {

  public static void main(String[] args) {

    System.out.println(split("SplitWord", 5)[0]);
    System.out.println(split("SplitWord", 5)[1]);

    //This will give an out of bounds error:
    //System.out.println(split("SplitWord", 13)[0]);
    //System.out.println(split("SplitWord", 13)[1]);
  }

  public static String[] split (String inputString, int splitIndex) {
    try {
      List<String> splitStrings = new ArrayList<>();

      splitStrings.add(inputString.substring(0, splitIndex));
      splitStrings.add(inputString.substring(splitIndex));

      String[] twoStrings = new String[splitStrings.size()];
      splitStrings.toArray(twoStrings);

      return twoStrings;
    } catch (IndexOutOfBoundsException outOfBounds) {
      System.out.println("Error: index is out of bounds");
      System.out.println(outOfBounds.getStackTrace());
      return null;
    }
  }
}
