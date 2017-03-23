/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Also, print the sentence to the output with spaces in between.

import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    int indexOfDo = list.indexOf("do");
    int indexOfCannot = list.indexOf("cannot");

    String wordDo = list.get(indexOfDo);
    String wordCannot = list.get(indexOfCannot);

    list.remove(indexOfDo);
    list.add(indexOfDo, wordCannot);
    list.remove(indexOfCannot);
    list.add(indexOfCannot, wordDo);

    int length = list.size();
    String completeQuote = "";

    for (int i = 1; i < length; i++) {
      completeQuote = completeQuote + list.get(i) + " ";
    }

    System.out.println(completeQuote);
  }
}
