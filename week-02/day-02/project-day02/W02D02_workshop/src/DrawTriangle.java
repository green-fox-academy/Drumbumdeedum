/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int userInt = scanner.nextInt();
    int a = 1;
    String star = "*";
    while (a <= userInt) {
      System.out.println(new String(new char[a]).replace("\0", star));
      a +=1;
    }
  }
}
