import  java.util.*;

/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Saturn is missing from the planetList
// Insert it into the correct position

public class SolarSystem {
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    planetList.add(planetList.indexOf("Uranus"), "Saturn");

    System.out.println(planetList);
  }
}
