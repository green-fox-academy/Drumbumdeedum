package date;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    // TODO - return with the parsed date; format is: yyyy-MM-dd
    return LocalDate.parse(str);
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    // TODO - return the date formatted: month & day (MM. dd.)
    String month = Integer.toString(date.getMonthValue()) + ".";
    String day = Integer.toString(date.getDayOfMonth()) + ".";

    if (month.length() == 2) {
      month = "0" + month;
    }
    if (day.length() == 2) {
      day = "0" + day;
    }

    return month + " " + day;
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    // TODO - return with true if today is the same month+day as date

    String dateNow = printMonthAndDay(ZonedDateTime.now().toLocalDate());

    if (dateNow.equals(printMonthAndDay(date))) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    // TODO - return how many years age the input date 'birthday' was

    int yearsPassed = 0;
    if (birthday.isAfter(LocalDate.now())) {
      yearsPassed = 0;
    } else {
      if (birthday.getMonthValue() == LocalDate.now().getMonthValue()) {
        if (birthday.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
          yearsPassed = (int)(ChronoUnit.YEARS.between(birthday, LocalDate.now()));
        } else if (birthday.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
          yearsPassed = (int)(ChronoUnit.YEARS.between(birthday, LocalDate.now()));
        } else if (birthday.getDayOfMonth() > LocalDate.now().getDayOfMonth()) {
          yearsPassed = (int)(ChronoUnit.YEARS.between(birthday, LocalDate.now()))-1;
        }
      } else if (birthday.getMonthValue() < LocalDate.now().getMonthValue()) {
        yearsPassed = (int)(ChronoUnit.YEARS.between(birthday, LocalDate.now()));
      } else if (birthday.getMonthValue() > LocalDate.now().getMonthValue()) {
        yearsPassed = (int)(ChronoUnit.YEARS.between(birthday, LocalDate.now()))-1;
      }
    }

    return yearsPassed;
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)

    int yearsPassed = LocalDate.now().getYear() - date.getYear();
    int daysLeft = 0;

    if (date.getMonthValue() == LocalDate.now().getMonthValue()) {
      if (date.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
        daysLeft = 0;
      } else if (date.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
        daysLeft = (int)(ChronoUnit.DAYS.between(LocalDate.now(), date.plusYears(yearsPassed+1)));
      } else if (date.getDayOfMonth() > LocalDate.now().getDayOfMonth()) {
        daysLeft =  (int)(ChronoUnit.DAYS.between(LocalDate.now(), date.plusYears(yearsPassed)));
      }
    } else if (date.getMonthValue() < LocalDate.now().getMonthValue()) {
      daysLeft =  (int)(ChronoUnit.DAYS.between(LocalDate.now(), date.plusYears(yearsPassed+1)));
    } else if (date.getMonthValue() > LocalDate.now().getMonthValue()) {
      daysLeft =  (int)(ChronoUnit.DAYS.between(LocalDate.now(), date.plusYears(yearsPassed)));
    }

    return daysLeft;
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {
    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    int ageInYears = calculateAgeInYears(birthdayDate);
    int daysLeft = calculateDaysToNextAnniversary(birthdayDate);

    if (isAnniversaryToday(birthdayDate)) {
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      print("You are " + ageInYears + " years old.");
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}
