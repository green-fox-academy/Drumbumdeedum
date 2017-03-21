/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a random integer number: ");
    int userNumber = scanner.nextInt();
      int oddOrEven = userNumber % 2;
      if (oddOrEven == 0) {
        System.out.println("Even");
      } else if (oddOrEven == 1) {
        System.out.println("Odd");
      } else {
        System.out.println("The number you entered is not a valid integer number. Please enter a valid whole number:");
      }
  }
}
