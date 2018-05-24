// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
  public static void main(String[] args) {
    int bunnyEars = bunnyEarCounter(7);
    System.out.println(bunnyEars);
  }

  private static int bunnyEarCounter(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else {
      return (2 + bunnyEarCounter(bunnies - 1));
    }
  }
}

