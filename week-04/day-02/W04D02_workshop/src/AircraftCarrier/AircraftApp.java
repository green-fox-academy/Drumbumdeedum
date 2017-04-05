package AircraftCarrier;

public class AircraftApp {

  public static void main(String[] args) {

  Carrier carrier1 = new Carrier(3000, 3000, "The Destroyer");

  carrier1.addAircraft("F16");
  carrier1.addAircraft("F16");
  carrier1.addAircraft("F16");
  carrier1.addAircraft("F16");
  carrier1.addAircraft("F35");
  carrier1.addAircraft("F35");
  carrier1.addAircraft("F35");

  carrier1.fill();
  System.out.println();

  Carrier carrier2 = new Carrier(3000,3000, "Helpless Victim");

  carrier1.getStatus();
  System.out.println();

  carrier1.fight(carrier2);
  System.out.println();

  carrier1.getStatus();
    
  }
}
