/**
 * Created by danielszalay on 2017. 03. 21..
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 23;
    int currentMinutes = 02;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    // Should be 37578

    int remainingHoursInSeconds = (24 - currentHours)*3600;
    int remainingMinutesInSeconds = (60 - currentMinutes)*60;
    int remainingSeconds = 60 - currentSeconds;
    int remainingSecondsFromDAy = remainingSeconds+remainingMinutesInSeconds+remainingHoursInSeconds;

    System.out.println("There are " + remainingSecondsFromDAy + " seconds remaining from this day.");
  }
}
