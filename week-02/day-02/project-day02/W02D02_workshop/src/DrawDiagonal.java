/**
 * Created by danielszalay on 2017. 03. 22..
 */
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%%
// %%    %
// % %   %
// %  %  %
// %   % %
// %    %%
// %%%%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int userInt = scanner.nextInt();
    int a = 1;
    System.out.println(new String(new char[userInt]).replace("\0", "*"));
    while (a <= userInt-2) {
      System.out.println(
        ("*") +
        (new String(new char[a-1]).replace("\0", " ")) +
        ("*") +
        (new String(new char[userInt - 2 - a]).replace("\0", " ")) +
        ("*"));
      a += 1;
    }
    System.out.println(new String(new char[userInt]).replace("\0", "*"));
  }
}
