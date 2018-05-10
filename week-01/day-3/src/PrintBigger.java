// Write a program that asks for two numbers and prints the bigger one
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("In the following task, You will have to enter two different integers. Please, enter your first integer:");

        int userInput1 = scanner.nextInt();

        System.out.println("Please, enter your second integer:");

        int userInput2 = scanner.nextInt();

        if (userInput1 < userInput2) {
            System.out.println(userInput2 + " is the greater number.");
        } else if (userInput1 > userInput2) {
            System.out.println(userInput1 + " is the greater number.");
        } else {
            System.out.println("INVALID INPUT");
        }

    }
}
