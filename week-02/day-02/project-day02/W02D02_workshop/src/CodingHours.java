/**
 * Created by danielszalay on 2017. 03. 21..
 */
public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    int hoursCoding = (6*5*17);
    int percentage = (((6*5*100)/52*100)/100);

    System.out.println("We spend a total of "+ hoursCoding + " hours with coding during the semester.");
    System.out.println("This is "+ percentage +" percent of our total working hours.");
  }
}
