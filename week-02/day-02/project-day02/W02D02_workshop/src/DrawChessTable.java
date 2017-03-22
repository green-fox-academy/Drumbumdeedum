/**
 * Created by danielszalay on 2017. 03. 22..
 */
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class DrawChessTable {
  public static void main(String[] args) {
    int a = 2;
    while (a <= 9) {
      if (a % 2 == 0 ){
        System.out.println(new String(new char[8]).replace("\0", "% "));
      } else {
        System.out.println(new String(new char[8]).replace("\0", " %"));
      }
    a += 1;
    }
  }
}
