/**
 * Created by danielszalay on 2017. 03. 22..
 */
// Create an array variable named `s`
// with the following content: `[1, 2, 3, 8, 5, 6]`
// Change the 8 to 4
// Print the fourth element

public class ChangeElement {
  public static void main(String[] args) {
    int[] s = {1, 2, 3, 8, 5, 6};
    s[3] = 4;

    for (int i=0; i < s.length; i++) {
      System.out.println(s[i]);
    }
  }
}
