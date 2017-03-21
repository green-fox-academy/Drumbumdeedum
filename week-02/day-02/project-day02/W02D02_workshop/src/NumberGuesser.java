import java.util.Scanner;

/**
 * Created by danielszalay on 2017. 03. 21..
 */
public class NumberGuesser {
  public static void main(String[] args) {
    boolean gotANumber = false;
    while (!gotANumber) {
      System.out.println("Please think of a ramdom number! Type: \"Got it!\" when you are done.");
      Scanner scanner = new Scanner(System.in);
      String userInput = scanner.nextLine();
      if ("Got it!".equals(userInput)) {
        System.out.println("Cool, let's play!");
        gotANumber = true;
      }
    }
    int lowerGuessed = 0;
    int higherGuessed = 200;
    int guessed = 100;
    boolean foundTheNumber = false;
    while (!foundTheNumber) {
        System.out.println("Is this your number: " + guessed + "? (Say \"yes\" or \"no\".)");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if ("yes".equals(userInput)) {
          foundTheNumber = true;
        } else {
          System.out.println("Is it bigger? (Say \"yes\" or \"no\".)");
          Scanner scanner = new Scanner(System.in);
          String userInput = scanner.nextLine();
        }
        if ("yes".equals(userInput)) {
          lowerGuessed = guessed;
          guessed += (higherGuessed - lowerGuessed) / 2;
        } else {
          higherGuessed = guessed;
          guessed -= (higherGuessed - lowerGuessed) / 2;
        }
    }
    System.out.println("Cool, your number is" + guessed + "!");
  }
}
