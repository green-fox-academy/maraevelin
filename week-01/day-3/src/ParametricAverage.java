// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    double coefficient = scanner.nextInt();
    double sum = 0;

    System.out.println("Now enter " + (int) coefficient + " times different integers: ");
    for (int i = 0; i < coefficient ; i++) {
      double newInputs = scanner.nextInt();
      sum += newInputs;
    }
    System.out.println("Sum: " + (int) sum + ", Average: " + sum/coefficient);
  }

}
