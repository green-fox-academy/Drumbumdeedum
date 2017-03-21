/**
 * Created by danielszalay on 2017. 03. 21..
 */
import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    System.out.println("Please enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String userInput1 = scanner.nextLine();
    System.out.println("Hello " + userInput1 + "!");
  }
}
