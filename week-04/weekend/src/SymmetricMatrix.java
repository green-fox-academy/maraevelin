import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

  public static void main(String[] args) {
    // Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
    // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
    // or false if it is not
    //
    // example for symmetric matrix:
    // 1 0 1
    // 0 2 2
    // 1 2 5
    //
    // example for not symmetric matrix
    // 7 7 7
    // 6 5 7
    // 1 2 1

    ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 2, 2)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));

    System.out.println(isSymmetric(symmetricMatrix)); // should print out true
    System.out.println(isGood(symmetricMatrix)); // should print out true
  }

  public static boolean isGood(ArrayList<ArrayList<Integer>> symmetricMatrix) {
    int n = symmetricMatrix.size();
    for (int i = 0; i < n; i++) {
      if (symmetricMatrix.get(i + 1).get(i) == symmetricMatrix.get(i).get(i + 1)) {
        return true;
      }
      return false;
    }
    return isGood(symmetricMatrix);
  }

  public static boolean isSymmetric(ArrayList<ArrayList<Integer>> integerMatrix) {
    int n = integerMatrix.size();
    int m = n - 1;
    if (integerMatrix.get(0).get(n - m) == integerMatrix.get(1).get(0) &&
        integerMatrix.get(0).get(m) == integerMatrix.get(m).get(0) &&
        integerMatrix.get(n - m).get(m) == integerMatrix.get(m).get(n - m)) {
      return true;
    }
    return false;
  }
}