package sumarray;

public class SumArray {

  public static <T extends Number> void sumArray(T[] arrayToSum, int length) {
    try {
      int sum = 0;

      for (int i=0; i < length; i++) {
        sum += arrayToSum[i].intValue();
      }
      System.out.println(sum);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index out of bounds!");
    }
  }

  public static void main(String[] args) {
    Integer[] integers = {4, 3, 6, 2, 5, 1};
    Double[] doubles = {4.5, 3.5, 2.0, 5.0, 1.0};

    sumArray(integers, 7);
    sumArray(doubles, 3);
  }
}
