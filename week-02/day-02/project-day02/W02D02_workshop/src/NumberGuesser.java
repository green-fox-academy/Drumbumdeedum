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
  }
}
