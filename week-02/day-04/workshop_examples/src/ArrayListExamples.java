import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by danielszalay on 2017. 03. 23..
 */
public class ArrayListExamples {
  public static void main(String[] args) {
    ArrayList <Integer> list1 = new ArrayList(Arrays.asList(1, 2, 5));

    list1.add(2, 3);
    list1.set(3, 4);

    System.out.println(list1);
    System.out.println("The arrayList \'list1\' contains " + list1.size() + " elements.");
    System.out.println("The first element of \'list1\' is " + list1.get(0));

    System.out.println("-----------------------------------------------");

    String s = "Doesitcontain?";
    String contain = "it";
    System.out.println("Does the string 's' contain the character(s): '" + contain + "'? " + s.contains(contain));

  }
}
