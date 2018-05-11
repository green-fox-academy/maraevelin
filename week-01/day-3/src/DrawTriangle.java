// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was


import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To draw a triangle, please enter a number to give its height: ");

        int userInput1 = scanner.nextInt();
        int apexOfTriangle = 1;
        String s = "*";

        while (apexOfTriangle <= userInput1) {
            System.out.println(s);
            apexOfTriangle++;
            s+="*";
        }
    }
}
