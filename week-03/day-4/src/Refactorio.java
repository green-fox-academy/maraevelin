public class Refactorio {
  public static void main(String[] args) {

    int factorialOfInput = getFactorial(5);
    System.out.println(factorialOfInput);
  }

  private static int getFactorial(int input) {
    if (input == 1) {
      return 1;
    } else {
      return input * getFactorial(input - 1);
    }
  }
}
