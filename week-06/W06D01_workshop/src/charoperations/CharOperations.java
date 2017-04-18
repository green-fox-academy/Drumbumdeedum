package charoperations;

public class CharOperations implements CharSequence {

  String parameter;

  public CharOperations(String transform){
    parameter = transform;
  }

  @Override
  public int length() {
    return parameter.length();
  }

  @Override
  public char charAt(int index) {
    return parameter.charAt(parameter.length() - (index + 1));
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reverseString = "";

    for (int i=start; i <= end; i++) {
      reverseString += charAt(i);
    }

    return reverseString;
  }

  @Override
  public String toString() {

    String reverseString = "";

    for (int i=0; i < parameter.length(); i++) {
      reverseString += parameter.substring(parameter.length()-i-1, parameter.length()-i);
    }

    return reverseString;
  }
}
