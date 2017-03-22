import java.util.Arrays;

/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end

public class AppendArray {
  public static void main(String[] args) {

    String[] nimals = {"kuty", "macsk", "cic"};

    for (int x = 0; x < nimals.length; x++) {
      nimals[x] += "a";
    }
    System.out.println(Arrays.toString(nimals));
  }
}
