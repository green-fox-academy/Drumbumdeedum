/**
 * Created by danielszalay on 2017. 03. 22..
 */
//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

public class Greet {
  public static void main(String[] args) {
    System.out.println(greet(al));
  }

  static String al = "Greenfox";

  public static String greet (String input) {
    return ("Greetings dear, "+ input + "!");
  }
}
