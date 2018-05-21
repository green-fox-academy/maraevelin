// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was// Write a program that reads a number from the standard input, then draws a
//// square like this:

public class DrawDiagonal {
  public static void main(String[] args) {
    int standardInput = 5;
    String sketch = "% ";
    String emptySpace = "  ";

    for (int i = 0; i < standardInput; i++) {
      System.out.println(emptySpace);
      for (int j = 0; j < standardInput; j++) {
        if (i == 0 || i == j || i == standardInput - 1 || j == 0 || j == standardInput - 1) {
          System.out.print(sketch);
        } else {
          System.out.print(emptySpace);
        }
      }
    }
  }
}