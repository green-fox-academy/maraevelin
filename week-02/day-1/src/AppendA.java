// - Create an array variable named `animals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end

import java.util.Arrays;

public class AppendA {
  public static void main(String[] args) {

    String[] animals = {"kuty", "macsk", "cic"};

    System.out.println(Arrays.deepToString(animals));

    for (int i = 0; i < animals.length; i++) {
      animals[i] += "a";
    }

    System.out.println(Arrays.deepToString(animals));











  }


}
