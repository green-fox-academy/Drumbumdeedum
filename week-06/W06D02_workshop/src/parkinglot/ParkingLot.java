package parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import parkinglot.Car.COLOR;
import parkinglot.Car.TYPE;

public class ParkingLot {

  List<Car> carsInLot;
  Car newCar;

  public ParkingLot(int numberOfCars) {
    carsInLot = new ArrayList<>();
    for (int i=0; i < numberOfCars; i++) {
      newCar = new Car();
      carsInLot.add(newCar);
    }
  }

  public HashMap<TYPE, Integer> nrOfTypes() {
    HashMap<TYPE, Integer> typeMap = new HashMap<>();

    for (int i=0; i < this.carsInLot.size(); i++) {
      if (typeMap.containsKey(this.carsInLot.get(i).type)) {
        typeMap.replace(this.carsInLot.get(i).type, typeMap.get(this.carsInLot.get(i).type) + 1);
      } else {
        typeMap.put(this.carsInLot.get(i).type, 1);
      }
    }
    return typeMap;
  }

  public HashMap<COLOR, Integer> nrOfColors() {
    HashMap<COLOR, Integer> colorMap = new HashMap<>();

    for (int i=0; i < this.carsInLot.size(); i++) {
      if (colorMap.containsKey(this.carsInLot.get(i).color)) {
        colorMap.replace(this.carsInLot.get(i).color, colorMap.get(this.carsInLot.get(i).color) + 1);
      } else {
        colorMap.put(this.carsInLot.get(i).color, 1);
      }
    }
    return colorMap;
  }

  public HashMap<String, Integer> colorAndType() {
    HashMap<String, Integer> colorTypeMap = new HashMap<>();

    for (int i=0; i < this.carsInLot.size(); i++) {
      if (colorTypeMap.containsKey(this.carsInLot.get(i).toString())) {
        colorTypeMap.replace(this.carsInLot.get(i).toString(), colorTypeMap.get(this.carsInLot.get(i).toString()) + 1);
      } else {
        colorTypeMap.put(this.carsInLot.get(i).toString(), 1);
      }
    }
    return colorTypeMap;
  }

  public String mostCommon() {
    String mostCommon = "";
    int bufferFrequency = 0;

    for (int i=0; i < this.carsInLot.size(); i++) {
      if (this.colorAndType().containsKey(this.carsInLot.get(i).toString()) && (this.colorAndType().get(this.carsInLot.get(i).toString())) > bufferFrequency) {
        mostCommon = this.carsInLot.get(i).toString();
        bufferFrequency = (this.colorAndType().get(this.carsInLot.get(i).toString()));
      }
    }
    return mostCommon;
  }

  public String toString() {
    return carsInLot.toString();
  }
}
