/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

import java.util.Arrays;

public class DoubleItems {
  public static void main(String[] args) {
    int [] ag = {3, 4, 5, 6, 7};

    for (int x = 0; x < ag.length; ++x) {
      ag[x] *= 2;
    }
    System.out.println(Arrays.toString(ag));
  }
}
