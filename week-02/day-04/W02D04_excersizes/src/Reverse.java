/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    reversed = reverser(reversed);
    System.out.println(reversed);
  }

  public static String reverser(String input) {

    String reversedInput = "";

    for (int i = 0; i < input.length(); i++) {
      reversedInput += input.charAt(input.length()-1-i);
    }

    return reversedInput;
  }
}
