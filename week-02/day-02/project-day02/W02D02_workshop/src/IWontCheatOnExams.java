/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

public class IWontCheatOnExams {
  public static void main(String[] args) {
    int a = 1;
    while (a <= 100) {
      System.out.println(a + ". I won't cheat on the exam!");
      a += 1;
    }
  }
}
