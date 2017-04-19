package reservation;

public class Reservation implements ReservationInterface {

  String reservationCode;
  int reservationDOW;

  public Reservation() {
    reservationCode = new String();
    for (int i=0; i < 8; i++) {
      reservationCode += CHARS.charAt((int) (Math.random() * CHARS.length()));

    }
    reservationDOW = (int)(Math.random() * DOW.length);
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
    return "Booking# " + getCodeBooking() + " for " + getDowBooking();
  }
}
