package creditcard;

public class CreditCard implements CreditCardInterface {

  String cardHolderName;
  String cCardNumber;
  int sum;

  public CreditCard(String name) {
    cardHolderName = name;
    cCardNumber = new String();
    for (int i=0; i < 16; i++) {
      cCardNumber += (int)(Math.random() * 10);
    }
    sum = 0;
    for (int i=0; i < 16; i++) {
      sum += Integer.valueOf(cCardNumber.substring(i, i+1));
    }
  }

  @Override
  public int getSumCVV() {
    return sum;
  }

  @Override
  public String getNameCardholder() {
    return cardHolderName;
  }

  @Override
  public String getCodeAccount() {
    return cCardNumber;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    return 0;
  }

  @Override
  public String toString() {
    return "Name=" + getNameCardholder() + " CC#=" + getCodeAccount() + " CVV=" + getSumCVV();
  }
}
