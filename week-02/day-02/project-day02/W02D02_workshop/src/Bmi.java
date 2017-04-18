/**
 * Created by danielszalay on 2017. 03. 21..
 */
public class Bmi {
  public static void main(String[] args) {
    double massInKg = 92.5;
    double heightInM = 1.92;

    // Print the Body mass index (BMI) based on these values
    System.out.println(massInKg / (heightInM * heightInM));
  }
}