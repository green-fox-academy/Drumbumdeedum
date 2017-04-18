/**
 * Created by danielszalay on 2017. 03. 22..
 */
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    int random = (int)(Math.random()* 10 + 5);
    int a = random;
    int total = 0;
    int userInt;
    while (a > 0) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a number!");
      userInt = scanner.nextInt();
      total = total + userInt;
      a -= 1;
    }
    System.out.println("Sum: " + total + " Average: " + total/random);
  }
}
