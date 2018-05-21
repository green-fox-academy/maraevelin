// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int storedNumber = 8;
    System.out.println("I'm thinking of a number. Guess which one: ");
    int guess = scanner.nextInt();

    while (guess != storedNumber) {
      if (guess > storedNumber) {
        System.out.println("Try lower");
        guess = scanner.nextInt();
      } else {
        System.out.println("Try higher");
        guess = scanner.nextInt();
      }
    }

    if (storedNumber == guess) {
      System.out.println("You got it!");
    }
  }
}