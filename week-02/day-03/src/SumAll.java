/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
import java.util.Arrays;

public class SumAll {
  public static void main(String[] args) {
    int[] ai = {3, 4, 5, 6, 7};

    int sum = 0;
    for (int x = 0; x < ai.length; x++) {
     sum += ai[x];
    }

    System.out.println("The sum of the elements in ai equals: " + sum);
  }
}

