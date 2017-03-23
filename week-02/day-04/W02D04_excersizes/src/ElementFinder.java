/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
// Do this again with a different solution using different list functions!

import java.util.*;

public class ElementFinder{
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7));

    if (arrayList.contains(7)) {
      System.out.println("Hoorray!");
    } else {
      System.out.println("Noooooooo!");
    }

    System.out.println();


/*
    for (int i = 0; i < 7; i++) {

      String listWord = Integer.toString(arrayList.get(i));
      String word1 = "7";
      String word2 = "";
      word2 = listWord;

      if (word1.equals(word2)) {
        System.out.println("Hoorray!");
      } else {
      }
    }*/
  }
}