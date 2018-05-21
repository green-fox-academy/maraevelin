// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

public class DrawSquare {
  public static void main(String[] args) {
   int standardInput = 5;
   String brick = "% ";
   String emptySpace = "  ";

    for (int i = 0; i < standardInput; i++) {
      System.out.println(emptySpace);
      for (int j = 0; j < standardInput; j++) {
        if (i == 0 || j == 0 || i == standardInput - 1 ||j == standardInput - 1) {
          System.out.print(brick);
        } else {
          System.out.print(emptySpace);
        }


      }

    }
  }
}
