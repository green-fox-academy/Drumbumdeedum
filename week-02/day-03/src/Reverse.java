import java.util.Arrays;

/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int[] reverse_aj = new int [5];

    for (int x = aj.length-1; x >= 0 ; x--) {
      reverse_aj[reverse_aj.length-x-1] = aj[x];
    }
    System.out.println(Arrays.toString(reverse_aj));
  }
}
