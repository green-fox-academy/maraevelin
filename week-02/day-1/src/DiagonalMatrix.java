// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class DiagonalMatrix {
  public static void main(String[] args) {

  int dynamicValue = 4;
  int[][] arraysOfMatrix = new int[dynamicValue][dynamicValue];

   for (int row = 0; row < arraysOfMatrix.length; row++) {
    for (int column = 0; column < arraysOfMatrix.length; column++) {
      if (row == column) {
        arraysOfMatrix[row][column] = 1;
      } else {
        arraysOfMatrix[row][column] = 0;
      }

     }

   }
   int newRow = 0;
   for (int[] array : arraysOfMatrix) {
     System.out.println(Arrays.toString(arraysOfMatrix[newRow]));
     newRow++;
   }

  }

}

