package charoperations;

public class Main {

  public static void main(String[] args) {

    CharOperations op1 = new CharOperations("word1");

    System.out.println(op1.length());
    System.out.println(op1.charAt(2));
    System.out.println(op1.subSequence(2,4));
    System.out.println(op1.toString());
  }
}
