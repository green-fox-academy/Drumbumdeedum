/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int userInt1 = scanner.nextInt();
    System.out.println("Please enter another number: ");
    int userInt2 = scanner.nextInt();
    if (userInt1 >= userInt2) {
      System.out.println("The second number should be bigger.");
    } else {
      int a = userInt1;
      while (a < userInt2) {
        System.out.println(a);
        a += 1;
      }
    }
  }
}
