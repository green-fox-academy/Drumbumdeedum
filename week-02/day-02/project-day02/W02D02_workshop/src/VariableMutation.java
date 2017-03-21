/**
 * Created by danielszalay on 2017. 03. 21..
 */
public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    // make it bigger by 10
    a += 10;
    System.out.println(a);

    int b = 100;
    // make it smaller by 7
    b -= 7;
    System.out.println(b);

    int c = 44;
    // please double c's value
    c *= 2;
    System.out.println(c);

    int d = 125;
    // please divide by 5 d's value
    d /= 5;
    System.out.println(d);

    int e = 8;
    // please cube of e's value
    e *= e;
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    if (f1 > f2) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    int g1 = 350;
    int g2 = 200;
    int g2double = g2 * 2;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    if (g2double > g1) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    long h = 1357988018575474l;
    long hremainder = h % 11;
    // tell if it has 11 as a divisor (print as a boolean)
    if (hremainder == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    int i1 = 10;
    int i2 = 3;
    int i2square = i2*i2;
    int i2cube = i2*i2*i2;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    if ((i1 > i2square) && (i1 < i2cube)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    int j = 1521;
    int jDiv3Remainder = j % 3;
    int jDiv5Remainder = j % 5;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    if ((jDiv3Remainder == 0) || (jDiv5Remainder ==0)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    String k = "Apple";
    //fill the k variable with its content 4 times
    k = k + k + k + k;


    System.out.println(k);
  }
}
