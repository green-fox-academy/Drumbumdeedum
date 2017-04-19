package reservation;

public interface ReservationInterface {

  String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  String CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";


  String getDowBooking();

  String getCodeBooking();

  String toString (); //format("Booking# %s for %s");
}
