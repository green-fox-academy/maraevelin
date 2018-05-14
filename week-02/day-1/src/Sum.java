////  Create the usual class wrapper
////  and main method on your own.
//
//// - Write a function called `sum` that sum all the numbers
////   until the given parameter and returns with an integer
//
public class Sum {

  public static void main(String[] args) {
    int givenParameter = 6;
    System.out.println(sum(givenParameter));
  }


  public static int sum(int maxValue) {
//    int sumValue = maxValue * (maxValue + 1) / 2;
//    return sumValue;

    int sumValue = 0;
    for (int i = 0; i < (maxValue + 1); i++) {
      sumValue = sumValue + i;
    }

    return sumValue;
  }
}