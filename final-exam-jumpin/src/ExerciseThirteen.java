/*13.

  Create a function that takes a list of strings and transforms it like:
  [
    "abc",
    "ijk",
    "xyz"
  ]
  becomes:
  [
    "aix",
    "bjy",
    "ckz"
  ]*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseThirteen {

  public static void main(String[] args) {
    List<String> exampleList = new ArrayList<>(Arrays.asList("abc", "ijk", "xyz"));
    System.out.println(mixLetters(exampleList));
  }

  public static List<String> mixLetters(List<String> inputList) {
    List<String> outputList = new ArrayList();

    for (int i = 0; i < inputList.size(); i++) {
      String currentWord = inputList.get(i);
      for (int j = 0;  j < currentWord.length(); j++) {
        if (outputList.size() < currentWord.length()) {
          outputList.add(j, Character.toString(currentWord.charAt(j)));
        } else {
          outputList.add(j, outputList.get(j).concat(Character.toString(currentWord.charAt(j))));
          outputList.remove(j + 1);
        }
      }
    }
    return outputList;
  }
}
