// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
  public static void main(String[] args) {
    int n = 2;
    int base = 5;
    int power = powerN(base, n);
    System.out.println(power);
  }

  private static int powerN(int base, int n) {
    if (n == 1) {
    return 1;
    } else {
      return (base * base - 1) + powerN(base, n - 1);
    }
  }
}
