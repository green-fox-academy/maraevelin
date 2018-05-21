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
    int tableSize = 8;
    String black = "% ";
    String white = "  ";

    for (int i = 0; i < tableSize; i++) {
      System.out.println(white);
      for (int j = 0; j < tableSize; j++) {
        if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0 )) {
          System.out.print(black);
        } else {
          System.out.print(white);
        }

      }

    }
  }
}
