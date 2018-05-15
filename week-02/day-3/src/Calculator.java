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
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    public static void main(String... args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please type in the expression: ");
      String inputCalc = scanner.nextLine();

      ArrayList<String> operatorsList = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "%"));
      ArrayList<String> calcList = new ArrayList<>();

      for (String s : inputCalc.split(" ")) {
        calcList.add(s);
      }
     // System.out.println(calcList);

      if (operatorsList.contains(calcList.get(0))) {
        } else {
        System.out.println("invalid operator was entered");
      };

      

      System.out.println(calcList.get(1) + calcList.get(0) + calcList.get(2));

    }
}

