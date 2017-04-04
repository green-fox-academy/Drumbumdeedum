package AircraftCarrier;

public class AircraftApp {

  public static void main(String[] args) {

  Carrier carrier1 = new Carrier(3000, 2000);

  carrier1.addAircraft("F16");
  carrier1.addAircraft("F16");
  carrier1.addAircraft("F16");
  carrier1.addAircraft("F16");
  carrier1.addAircraft("F35");
  carrier1.addAircraft("F35");
  carrier1.addAircraft("F35");

  carrier1.fill();

  Carrier carrier2 = new Carrier(2000,2000);

  carrier1.getStatus();

  carrier1.fight(carrier2);

  carrier1.getStatus();
  }
}
