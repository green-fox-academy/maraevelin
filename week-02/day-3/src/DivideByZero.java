// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Divide 10 by a number: ");
    Integer divisor = scanner.nextInt();

    System.out.println(functionDivisionByZero(divisor));

  }

  public static String functionDivisionByZero (Integer inputDivider) {

    try {
      Integer result = 10 / inputDivider;
      return result.toString();
    } catch (ArithmeticException e) {
      return "fail!";
    }

  }
}