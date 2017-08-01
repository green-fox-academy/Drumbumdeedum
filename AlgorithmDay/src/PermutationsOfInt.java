import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationsOfInt {

  private static final ArrayList<Long> possibleNumbers = new ArrayList<>(Arrays.asList(0l,1l,2l,3l,4l,5l,6l,7l,8l,9l));

  public static void main(String[] args) {

    ArrayList<Long> allNumbers = new ArrayList<>();

    while (allNumbers.size() < factorial(possibleNumbers.size())) {
      long valueToAdd = randomNumber();
      if(!allNumbers.contains(valueToAdd)) {
        allNumbers.add(valueToAdd);
        Collections.sort(allNumbers);
        System.out.println(allNumbers.size());
      }
    }
    System.out.println(allNumbers.get(1000000));
  }

  public static long factorial(long input) {
    long result = 1;
    for (int i = 1; i <= input; i++) {
      result *= i;
    }
    return result;
  }

  public static Long randomNumber() {
    Collections.shuffle(possibleNumbers);
    StringBuilder numberString = new StringBuilder();
    for (int i = 0; i < possibleNumbers.size(); i++) {
      numberString.append(possibleNumbers.get(i));
    }
    return Long.valueOf(numberString.toString());
  }
}
