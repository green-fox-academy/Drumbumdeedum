import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationsOfInt {

  private static final ArrayList<Integer> possibleNumbers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

  public static void main(String[] args) {
    System.out.println(randomNumber());
  }

  public static long factorial(long input) {
    long result = 1;
    for (int i = 1; i <= input; i++) {
      result *= i;
    }
    return result;
  }

  public static Integer randomNumber() {
    Collections.shuffle(possibleNumbers);
    StringBuilder numberString = new StringBuilder();
    for (int i = 0; i < possibleNumbers.size(); i++) {
      numberString.append(possibleNumbers.get(i));
    }
    return Integer.valueOf(numberString.toString());
  }
}
