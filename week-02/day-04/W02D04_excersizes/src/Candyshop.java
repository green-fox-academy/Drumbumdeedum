/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Accidentally we added "2" and "false" to the list.
// Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
// No, don't just remove the lines
import java.util.*;

public class Candyshop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    int indexOfTwo = arrayList.indexOf(2);
    int indexOfFalse = arrayList.indexOf(false);


    arrayList.remove(indexOfTwo);
    arrayList.add(indexOfTwo, "Croissant");
    arrayList.remove(indexOfFalse);
    arrayList.add(indexOfFalse, "Ice Cream");

    System.out.println(arrayList);
  }
}