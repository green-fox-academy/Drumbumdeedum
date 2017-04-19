package creditcard;

public interface CreditCardInterface {

  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(String codeAccount); // computes codeAccount checksum

  String toString (); //String.format("Name=%s CC#=%s CVV=%d");
}
