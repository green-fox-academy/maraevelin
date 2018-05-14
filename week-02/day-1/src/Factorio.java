//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorio {
  public static void main(String[] args) {
    int givenInput = 6;
    System.out.println(factorio(givenInput));

  }

  public static int factorio(int maxValue) {

    int factorValue = 1;
    for (int i = 1; i < (maxValue + 1); i++) {
      factorValue = factorValue * i;
    }

    return factorValue;
  }



}