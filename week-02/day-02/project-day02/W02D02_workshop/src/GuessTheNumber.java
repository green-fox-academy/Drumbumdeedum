/**
 * Created by danielszalay on 2017. 03. 22..
 */
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    int random = (int)(Math.random()* 10 + 1);
    boolean guessed = false;
    while (guessed == false) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Guess the number!");
      int userInt = scanner.nextInt();
      if (userInt == random) {
        System.out.println("You found the number: " + random);
        guessed = true;
      } else if (userInt > random) {
        System.out.println("The stored number is lower.");
      } else if (userInt < random) {
        System.out.println("The stored number is higher.");
      }
    }
  }
}

