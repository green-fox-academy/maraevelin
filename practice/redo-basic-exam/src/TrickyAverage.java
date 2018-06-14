import java.util.ArrayList;
import java.util.List;

/**
 * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
 * and returns the average of the smallest odd and largest even.
 *  - use only basic control flow statements, like 'for', 'if', etc.
 *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
 *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
 *
 * Example cases:
 * [1, 2, 3] -> should return 1.5
 * [3, 4, 5, 6] -> should return 4.5
 * [5, 2, 8, -1] -> should return 3.5
 */

public class TrickyAverage {

  public static void main(String[] args) {
    List<Integer> integerList1 = new ArrayList<>();
    integerList1.add(1);
    integerList1.add(2);
    integerList1.add(3);

    List<Integer> integerList2 = new ArrayList<>();
    integerList2.add(3);
    integerList2.add(4);
    integerList2.add(5);
    integerList2.add(6);

    List<Integer> integerList3 = new ArrayList<>();
    integerList3.add(5);
    integerList3.add(2);
    integerList3.add(8);
    integerList3.add(- 1);

    System.out.println(getTrickyAvg(integerList1));
    System.out.println(getTrickyAvg(integerList2));
    System.out.println(getTrickyAvg(integerList3));

  }

  public static double getTrickyAvg(List<Integer> integerList) {
    double tempSmallestOdd = integerList.get(0);
    double tempLargestEven = integerList.get(0);

    if (isIntegerListValid(integerList)) {
      for (int i = 0; i < integerList.size(); i++) {
        if (tempSmallestOdd > integerList.get(i) && integerList.get(i) % 2 != 0) {
          tempSmallestOdd = (double) integerList.get(i);
        } else if (tempLargestEven < integerList.get(i) && integerList.get(i) % 2 == 0) {
          tempLargestEven = (double) integerList.get(i);
        }
      }
    }
    return (tempSmallestOdd + tempLargestEven) / 2;
  }

  public static boolean isIntegerListValid(List<Integer> integerList) {
    if (integerList.size() >= 2 && integerListContainsOddAndEvenNumber(integerList)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean integerListContainsOddAndEvenNumber(List<Integer> integerList) {
    int oddNumberChecker = 2;
    int evenNumberChecker = 1;

    for (int i = 0; i < integerList.size(); i++) {
      if (integerList.get(i) % 2 != 0) {
        oddNumberChecker = integerList.get(i);
      } else {
        evenNumberChecker = integerList.get(i);
      }
    }

    if (oddNumberChecker != 2 &&
        evenNumberChecker != 1) {
      return true;
    } else {
      return false;
    }
  }
}