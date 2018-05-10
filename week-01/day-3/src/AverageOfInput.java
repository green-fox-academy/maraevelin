// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int userInput1 = scanner.nextInt();

        System.out.println("Enter a second integer number:");
        int userInput2 = scanner.nextInt();

        System.out.println("Enter a third integer number:");
        int userInput3 = scanner.nextInt();

        System.out.println("Enter a fourth integer number:");
        int userInput4 = scanner.nextInt();

        System.out.println("Enter a fifth integer number:");
        int userInput5 = scanner.nextInt();

        int sumOfInputs = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        double averageOfInputs = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5;


        System.out.println("Sum: " + sumOfInputs + ", Average: " + averageOfInputs);

    }
}
