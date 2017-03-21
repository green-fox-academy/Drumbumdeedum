/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("I will ask you to enter 5 integer numbers for me please. If you are ready, type \"Ready!\".");
    String userReady = scanner.nextLine();
    if ("Ready!".equals(userReady)) {
      System.out.println("Please enter the first number:");
      int firstNumber = scanner.nextInt();
      System.out.println("Please enter the second number:");
      int secondNumber = scanner.nextInt();
      System.out.println("Please enter the third number:");
      int thirdNumber = scanner.nextInt();
      System.out.println("Please enter the fourth number:");
      int fourthNumber = scanner.nextInt();
      System.out.println("Please enter the fifth number:");
      int fifthNumber = scanner.nextInt();

      int sumNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
      int avrgNumbers = sumNumbers / 5;

      System.out.println("Sum: " + sumNumbers + " Average: " + avrgNumbers);
    }
  }
}
