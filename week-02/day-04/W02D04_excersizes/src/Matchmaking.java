import java.util.*;

/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...


public class Matchmaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    int length = 0;

    if (girls.size() > boys.size()){
      length = boys.size();
    } else{
      length = girls.size();
    }

    for (int i = 0; i < length; i++ ) {
      int indexGirl = i * 2;
      int indexBoy = indexGirl + 1;
      order.add(indexGirl, girls.get(i));
      order.add(indexBoy, boys.get(i));
    }

    System.out.println(order);
  }
}