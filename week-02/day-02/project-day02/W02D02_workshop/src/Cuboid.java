/**
 * Created by danielszalay on 2017. 03. 21..
 */
public class Cuboid {
  public static void main(String[] args) {
    double side1 = 9.24;
    double side2 = 15.97;
    double side3 = 23.32;
    double surfaceArea = 2*(side1*side2+side1*side3+side2*side3);
    double volume = side1*side2*side3;


    System.out.println("Surface Area: " + surfaceArea);
    System.out.println("Volume: " + volume);
  }
}
