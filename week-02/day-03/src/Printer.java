import java.util.Arrays;

/**
 * Created by danielszalay on 2017. 03. 22..
 */
//  Create the usual class wrapper
//  and main method on your own.
// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)

public class Printer {
  public static void main(String[] args) {
    String[] lines = {"Work,", "for", "fucks", "sake!"};
    printer1(lines);

    System.out.println();

    String argument1 = "Működjél";
    String argument2 = "már,";
    String argument3 = "bassza-";
    String argument4 = "meg!";
    printer2(argument1, argument2, argument3, argument4);
  }

  public static void printer1(String[] parameters) {
    for (String currentString: parameters) {
      System.out.println(currentString);
    }
  }

  public static void printer2(String... toPrint) {
    for (String currentString: toPrint) {
      System.out.println(currentString);
    }
  }
}