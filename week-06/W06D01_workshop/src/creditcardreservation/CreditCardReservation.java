package creditcardreservation;

import creditcard.CreditCard;
import creditcard.CreditCardInterface;
import reservation.Reservation;
import reservation.ReservationInterface;

public class CreditCardReservation implements CreditCardInterface, ReservationInterface {

  String cardHolderName, cCardNumber, reservationCode;
  int sum, reservationDOW;

  public CreditCardReservation(String name) {
    cardHolderName = name;
    cCardNumber = new String();
    for (int i=0; i < 16; i++) {
      cCardNumber += (int)(Math.random() * 10);
    }
    sum = 0;
    for (int i=0; i < 16; i++) {
      sum += Integer.valueOf(cCardNumber.substring(i, i+1));
    }
    reservationCode = new String();
    for (int i=0; i < 8; i++) {
      reservationCode += CHARS.charAt((int) (Math.random() * CHARS.length()));

    }
    reservationDOW = (int)(Math.random() * DOW.length);
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
  public String getDowBooking() {
    return DOW[reservationDOW];
  }

  @Override
  public String getCodeBooking() {
    return reservationCode;
  }

  @Override
  public String toString() {
    return "Booking# " + getCodeBooking() + " for " + getDowBooking() + " paid by Name=" + getNameCardholder() + " CC#=" + getCodeAccount() + " CVV=" + getSumCVV();
  }
}
