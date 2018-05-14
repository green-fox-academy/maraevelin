// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};

    System.out.println(Arrays.toString(aj));

//    int temporal5 = aj[0];
//    aj[0] = aj[1];
//    aj[1] = aj[2];
//    aj[2] = aj[3];
//    aj[3] = aj[4];
//    aj[4] = temporal5;

    //for (foreach v fori)

    int temporal = 0;

    for (int i = 0; i <(aj.length/2) ; i++) {
      temporal = aj[i];
      aj[i] = aj[aj.length-1-i];
      aj[aj.length-1-i] = temporal;
    }

    System.out.println(Arrays.toString(aj));


  }


}
