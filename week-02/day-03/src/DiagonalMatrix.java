/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class DiagonalMatrix {
  public static void main(String[] args) {

    int size = 10;
    int[][] matrix = new int [size][size];

    for (int x = 0; x < size; x++) {
      for (int y = 0; y < size; y++) {
        if (x == y) {
          System.out.printf("1 ", matrix[x][y]);
        } else {
          System.out.printf("0 ", matrix[x][y]);
        }
      }
      System.out.println();
    }
  }
}
