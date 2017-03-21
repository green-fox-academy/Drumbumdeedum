/**
 * Created by danielszalay on 2017. 03. 21..
 */

import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int userInt = scanner.nextInt();
    int a = 1;
    String star = "*";
    String empty = " ";
    while (a <= userInt / 2 + 1) {
      System.out.println(
              (new String(new char[(userInt+1)/2-a]).replace("\0", empty)) +
              (new String(new char[a]).replace("\0", star)) +
              (new String(new char[a-1]).replace("\0", star)));
      a +=1;
    }
    a = 1;
    while (a <= userInt /2) {
      System.out.println(
              (new String(new char[a]).replace("\0", empty)) +
              (new String(new char[(userInt+1)/2-a]).replace("\0", star)) +
              (new String(new char[userInt / 2 - a]).replace("\0", star))
              );
      a += 1;
    }
  }
}

