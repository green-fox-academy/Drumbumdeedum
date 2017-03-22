import java.util.Arrays;

/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};

    String swapper = "empty";

    swapper = abc[0];
    abc[0] = abc[2];
    abc[2] = swapper;

    System.out.println(Arrays.toString(abc));
  }
}
