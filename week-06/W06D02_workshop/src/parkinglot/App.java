package parkinglot;

public class App {

  public static void main(String[] args) {

    ParkingLot newLot = new ParkingLot(256);

    System.out.println("Frequency of types: " + newLot.nrOfTypes());
    System.out.println("Frequency of colors: " + newLot.nrOfColors());
    System.out.println("Most common type + color combination: " + newLot.mostCommon());
  }
}
