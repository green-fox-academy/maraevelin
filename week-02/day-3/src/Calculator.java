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

    ArrayList operatorsList = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "%"));
    ArrayList<String> calcList = new ArrayList<>();

    for (String s : inputCalc.split(" ")) {
      calcList.add(s);
    }

    if (operatorsList.contains(calcList.get(0))) {
    } else {
      System.out.println("invalid operator was entered");
    }
    ;

    Integer operandA = Integer.parseInt(calcList.get(1));
    Integer operandB = Integer.parseInt(calcList.get(2));

    if (operatorsList.get(0).equals(calcList.get(0))) {
      System.out.println(operandA+operandB);
    } else if (operatorsList.get(1).equals(calcList.get(0))) {
      System.out.println(operandA-operandB);
    } else if (operatorsList.get(2).equals(calcList.get(0))) {
      System.out.println(operandA*operandB);
    } else if (operatorsList.get(3).equals(calcList.get(0))) {
      System.out.println(operandA/operandB);
    } else if (operatorsList.get(4).equals(calcList.get(0))) {
      System.out.println(operandA%operandB);
    } else {
      System.out.println("error");
    }

  }
}

//    System.out.println(operandA+operandB);
// System.out.println(operandA + calcList.get(0) + operandB);

//    if (calcList.get(0)==operatorsList.get(0)) {
//      int resultOfAddition=operandA+operandB;
//      System.out.println(resultOfAddition);
//    } else if (calcList.get(0)==operatorsList.get(1)) {
//      System.out.println(operandA-operandB);
//    } else if (calcList.get(0)==operatorsList.get(2)) {
//      System.out.println(operandA*operandB);
//    } else if (calcList.get(0)==operatorsList.get(3)) {
//      System.out.println(operandA/operandB);
//    } else if (calcList.get(0)==operatorsList.get(4)) {
//      System.out.println(operandA%operandB);
//    } else {
//      System.out.println("invalid input");
//    }

//    for (int i = 0; i == operatorsList.size() ; i++) {
//      while (operatorsList.get(i).equalscalcList.get(0)) {
//        if (i == 0) {
//          System.out.println(operandA+operandB);
//        } else if (i == 1) {
//          System.out.println(operandA-operandB);
//        } else if (i == 2) {
//          System.out.println(operandA*operandB);
//        } else if (i == 3) {
//          System.out.println(operandA/operandB);
//        } else if (i == 4) {
//          System.out.println(operandA%operandB);
//      } else {
//        System.out.println("invalid input");
//      }
//    }
//  }


