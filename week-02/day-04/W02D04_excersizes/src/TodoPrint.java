/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {
  public static void main(String... args){
    String todoText = "- Buy milk\n";

    todoText = (todoText.concat("- Download games\n")).concat("\t- Diablo");

    System.out.println(todoText);
  }
}
