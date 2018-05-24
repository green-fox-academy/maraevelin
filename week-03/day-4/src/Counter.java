public class Counter {
  public static void main(String[] args) {

    int countDown = countDown(5);
    System.out.println(countDown);

  }

  private static int countDown(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n - countDown(n - 1);
    }
  }
}
