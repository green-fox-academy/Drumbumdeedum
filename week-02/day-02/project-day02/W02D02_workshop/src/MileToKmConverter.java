/**
 * Created by danielszalay on 2017. 03. 21..
 */
import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    System.out.println("Please a distance in kilometers: ");
    Scanner scanner = new Scanner(System.in);
    int userInput2 = scanner.nextInt();
    double kminmiles = userInput2 * 0.62137;
    System.out.println(userInput2 + " kilometer is exactly " + kminmiles + " miles!");
  }
}
