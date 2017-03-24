/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit

import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    System.out.println("Please type in a mathematical");
    System.out.println("expression in the following format: ");
    System.out.println("{operation} {operand} {operand}");
    System.out.println("Examples:");
    System.out.println("+ 3 3 -> the result will be 6");
    System.out.println("* 4 4 -> the result will be 16");
    System.out.println("Please type in the expression: ");
    Scanner scanner = new Scanner (System.in);
    String userExpression = scanner.nextLine();

    Character operationChar = userExpression.charAt(0);
    String operationString = Character.toString(operationChar);

    int firstWhiteSpace = userExpression.indexOf(" ");
    int secondWhiteSpace = userExpression.indexOf(" ", firstWhiteSpace+1);
    int endOfUserExpression = userExpression.length();

    String value1String = userExpression.substring(firstWhiteSpace, secondWhiteSpace).trim();
    String value2String = userExpression.substring(secondWhiteSpace, endOfUserExpression).trim();
    int value1 = Integer.parseInt(value1String);
    int value2 = Integer.parseInt(value2String);

    if (operationString.equals("*")) {
      System.out.println(value1 + " * " + value2 + " = " + value1 * value2);
    } else if (operationString.equals("/")) {
      System.out.println(value1 + " / " + value2 + " = " + value1 / value2);
    } else if (operationString.equals("+")) {
      System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
    } else if (operationString.equals("-")) {
      System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
    } else if (operationString.equals("%")) {
      System.out.println(value1 + " % " + value2 + " = " + value1 % value2);
    }
  }
}