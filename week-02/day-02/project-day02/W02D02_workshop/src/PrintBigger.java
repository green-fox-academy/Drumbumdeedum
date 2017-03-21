/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {
  public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please enter a random number: ");
    int userNumber1 = scanner.nextInt();
    System.out.println("Please enter another random number: ");
    int userNumber2 = scanner.nextInt();
    if (userNumber1 < userNumber2) {
      System.out.println(userNumber2 + " is bigger!");
    } else if (userNumber2 < userNumber1) {
      System.out.println(userNumber1 + " is bigger!");
    } else {
      System.out.println("The two numbers are equal!");
    }
  }
}
