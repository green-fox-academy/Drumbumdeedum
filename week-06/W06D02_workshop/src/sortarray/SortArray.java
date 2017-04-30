package sortarray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortArray {

  public static <T extends Number> void sortArray(T[] arrayToSort) {
    Arrays.sort(arrayToSort, Collections.reverseOrder());
    ArrayList<T> printer = new ArrayList<>();
    for (int i=0; i < arrayToSort.length; i++) {
      printer.add(arrayToSort[i]);
    }
    System.out.println(printer);
  }

  public static void main(String[] args) {
    Integer[] integers = {4, 3, 6, 2, 5, 1};
    Double[] doubles = {4.0, 3.0, 2.0, 5.0, 1.0};
    sortArray(integers);
    sortArray(doubles);
  }
}
