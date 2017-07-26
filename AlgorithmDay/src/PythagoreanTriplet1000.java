import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PythagoreanTriplet1000 {

  public static void main(String[] args) {

    int sumOfThreeValues = 1000;
    System.out.println(findPythagoreanValues(sumOfThreeValues));
  }

  private static ArrayList<Long> findPythagoreanValues(long sumOfValues) {
    ArrayList<Long> threeValues = new ArrayList<>();
    for (long i = 1; i < sumOfValues/2; i++) {
      for (long j = 1; j < sumOfValues / 2; j++) {
        for (long k = 1; k < sumOfValues / 2; k++) {
          if (arePythagoreanNumbers(i, j, k) && (i + j + k) == sumOfValues && threeValues.size() < 3) {
            threeValues.add(i);
            threeValues.add(j);
            threeValues.add(k);
          }
        }
      }
    }
    return threeValues;
  }

  private static boolean arePythagoreanNumbers(long number1, long number2, long number3) {
    ArrayList<Long> threeNumbers = new ArrayList<>(Arrays.asList(number1, number2, number3));
    sortList(threeNumbers);
    return squareOf(threeNumbers.get(0)) +
        squareOf(threeNumbers.get(1)) ==
        squareOf(threeNumbers.get(2));
    }

  private static long squareOf(long number) {
    return number * number;
  }

  private static ArrayList<Long> sortList(ArrayList<Long> threeNumbers) {
      Collections.sort(threeNumbers);
      return threeNumbers;
  }
}
