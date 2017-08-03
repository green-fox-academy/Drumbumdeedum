import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationsOfInt {

  private static final ArrayList<Long> possibleNumbers = new ArrayList<>(Arrays.asList(0l,1l,2l,3l,4l,5l,6l,7l,8l,9l));

  public static void main(String[] args) {
    ArrayList<String> result = permutation("0123456789");
    Collections.sort(result);
    System.out.println(result.get(999999));
  }

  public static ArrayList<String> permutation(String input) {
    ArrayList<String> permutations = new ArrayList<>();
    if (input.length() == 1) {
      permutations.add(input);
    } else if (input.length() > 1) {
      int lastIndex = input.length() - 1;
      String last = input.substring(lastIndex);
      String rest = input.substring(0, lastIndex);
      permutations = merge(permutation(rest), last);
    }
    return permutations;
  }

  public static ArrayList<String> merge(ArrayList<String> list, String c) {
    ArrayList<String> res = new ArrayList<>();
    for (String s : list) {
      for (int i = 0; i <= s.length(); ++i) {
        String ps = new StringBuffer(s).insert(i, c).toString();
        res.add(ps);
      }
    }
    return res;
  }
}
