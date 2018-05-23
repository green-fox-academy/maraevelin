import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("It's number-guessing time! What should be the upper limit of the range?");
    int input = scanner.nextInt();
    int range = (int) Math.random() * input;
    int storedNumber = (int) Math.random() * range;
    int lives = 5;

    System.out.println(range);
    System.out.println(storedNumber);
  }
}

