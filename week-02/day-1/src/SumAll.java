// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

import java.util.Arrays;

public class SumAll {
  public static void main(String[] args) {

    int[] ai = {3, 4, 5, 6, 7};

    int sumNr = 0;
    for (int i : ai) {
      sumNr += i;
    }
      System.out.println(sumNr);
    }

  }

