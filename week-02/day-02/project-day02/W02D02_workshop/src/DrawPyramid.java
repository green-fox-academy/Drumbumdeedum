/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int userInt = scanner.nextInt();
    int a = 1;
    String star = "*";
    String empty = " ";
    while (a <= userInt) {
      System.out.println(
              (new String(new char[userInt-a]).replace("\0", empty))
              +(new String(new char[a]).replace("\0", star))
              +(new String(new char[a-1]).replace("\0", star)));
      a +=1;
    }
  }
}