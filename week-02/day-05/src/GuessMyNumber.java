/**
 * Created by danielszalay on 2017. 03. 24..
 */

import java.util.Scanner;

public class GuessMyNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Let's play a guessing game!\nI will think of a random number, and you have to guess it!\nFirst, lets pick the range!\nWhat should the first (lower) number be? This will be the floor of the range.");
    int firstNumber = scanner.nextInt();

    System.out.println("Cool! Now, what should the second (higher) number be? This will be the ceiling of the range.");
    int secondNumber = scanner.nextInt();

    System.out.println("You will have a limited amount of tries, also known as \"lives\". How many lives do you want to have?");
    int livesRemaining = scanner.nextInt();

    System.out.println("I will pick a number between " + firstNumber + " and " + secondNumber + " and you will have a total of " + livesRemaining + " lives.");
    System.out.println("Great! Now let's play! Guess the number!");

    int randomNumber = (int)(Math.random()* ((secondNumber - firstNumber)+1) + firstNumber);

    // randomNumber helper: displays randomNumber for testing purposes.
    // System.out.println("\n/Helper: the random number is: " + randomNumber + "/");

    boolean guessed = false;

    while (guessed == false && livesRemaining > 0) {

      int userInt = scanner.nextInt();

      if (userInt <  firstNumber || userInt > secondNumber) {
        System.out.println("That number is out of the range you just gave me! Pick another one you dummy!");
      } else if (userInt == randomNumber) {
        System.out.println("YAY! You found the number! It's " + randomNumber + "! Congratulations!");
        guessed = true;
      } else if (userInt > randomNumber) {
        livesRemaining -= 1;
        System.out.println("The stored number is lower. You have " + livesRemaining + " lives left.");
      } else if (userInt < randomNumber) {
        livesRemaining -= 1;
        System.out.println("The stored number is higher. You have " + livesRemaining + " lives left.");
      }
    }
    if (livesRemaining ==0) {
      System.out.println("GAME OVER!");
    }
  }
}




