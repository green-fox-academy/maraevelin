public class NumberAdder {
  public static void main(String[] args) {
    int sumOfAddition = numberAdder(5);
    System.out.println(sumOfAddition);
  }

  private static int numberAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + numberAdder(n - 1);
    }
  }
}
