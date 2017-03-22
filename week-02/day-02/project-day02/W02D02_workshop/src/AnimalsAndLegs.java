/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs the farmer has
// It should print how many legs all the animals have

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    System.out.println("How many chicken does the farmer have?");
    Scanner scanner = new Scanner(System.in);
    int numberOfChicken = scanner.nextInt();
    System.out.println("How many pigs does the farmer have?");
    int numberOfPigs = scanner.nextInt();
    int numberOfChickenLegs = numberOfChicken * 2;
    int numberOfPigLegs = numberOfPigs * 4;
    int totalLegs = numberOfChickenLegs + numberOfPigLegs;
    System.out.println("The farmers animals have " + totalLegs + " legs in total! Impressive!");
  }
}