// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations,
// create a method named "calculate()":
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("It's calculation time! \n " +
        "To do a simple calculation, enter an operator and two operands, separated with space. " +
        "\n Please type in the expression: ");
    String inputCalculator = scanner.nextLine();

    System.out.println(calculate(inputCalculator));
  }

  public static int calculate(String calculateInput) {

    ArrayList operatorsList = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "%"));
    ArrayList<String> calcList = new ArrayList<>();

    for (String s : calculateInput.split(" ")) {
      calcList.add(s);
    }

    if (operatorsList.contains(calcList.get(0))) {
    } else {
      System.out.println("invalid operator was entered");
    }

    Integer operandA = Integer.parseInt(calcList.get(1));
    Integer operandB = Integer.parseInt(calcList.get(2));

    if (operatorsList.get(0).equals(calcList.get(0))) {
      return operandA + operandB;
    } else if (operatorsList.get(1).equals(calcList.get(0))) {
      return operandA - operandB;
    } else if (operatorsList.get(2).equals(calcList.get(0))) {
      return operandA * operandB;
    } else if (operatorsList.get(3).equals(calcList.get(0))) {
      return operandA / operandB;
    } else {
      return operandA % operandB;
    }

  }
}
