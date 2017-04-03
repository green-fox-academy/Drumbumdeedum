public class PetrolStation {

  public static void main(String[] args) {

    Station station = new Station();
    Car car = new Car();

    System.out.println("Before refill:");
    System.out.println("Car gas capacity: "+ car.capacity);
    System.out.println("Car gas amount: " + car.gasAmount);
    System.out.println("Station gas amount: " + station.gasAmount);

    station.refill(car);
    System.out.println();

    System.out.println("After refill:");
    System.out.println("Car gas capacity: "+ car.capacity);
    System.out.println("Car gas amount: " + car.gasAmount);
    System.out.println("Station gas amount: " + station.gasAmount);

  }
}
