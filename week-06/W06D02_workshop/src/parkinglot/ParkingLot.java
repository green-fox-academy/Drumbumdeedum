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

    for (int i=0; i < lotSize(); i++) {
      if (typeMap.containsKey(getCar(i).type)) {
        typeMap.replace(getCar(i).type, typeMap.get(getCar(i).type) + 1);
      } else {
        typeMap.put(getCar(i).type, 1);
      }
    }
    return typeMap;
  }

  public HashMap<COLOR, Integer> nrOfColors() {
    HashMap<COLOR, Integer> colorMap = new HashMap<>();

    for (int i=0; i < lotSize(); i++) {
      if (colorMap.containsKey(getCar(i).color)) {
        colorMap.replace(getCar(i).color, colorMap.get(getCar(i).color) + 1);
      } else {
        colorMap.put(getCar(i).color, 1);
      }
    }
    return colorMap;
  }

  public HashMap<String, Integer> colorAndType() {
    HashMap<String, Integer> colorTypeMap = new HashMap<>();

    for (int i=0; i < lotSize(); i++) {
      if (colorTypeMap.containsKey(getCarInLotString(i))) {
        colorTypeMap.replace(getCarInLotString(i), colorTypeMap.get(getCarInLotString(i)) + 1);
      } else {
        colorTypeMap.put(getCarInLotString(i), 1);
      }
    }
    return colorTypeMap;
  }

  public String mostCommon() {
    String mostCommon = "";
    int bufferFrequency = 0;

    for (int i=0; i < lotSize(); i++) {
      if (this.colorAndType().containsKey(getCarInLotString(i)) && (this.colorAndType().get(getCarInLotString(i))) > bufferFrequency) {
        mostCommon = getCarInLotString(i);
        bufferFrequency = (this.colorAndType().get(getCarInLotString(i)));
      }
    }
    return mostCommon;
  }

  public Car getCar(int index) {
    return this.carsInLot.get(index);
  }

  public String getCarInLotString(int index) {
    return this.carsInLot.get(index).toString();
  }

  public int lotSize() {
    return this.carsInLot.size();
  }

  public String toString() {
    return carsInLot.toString();
  }
}
