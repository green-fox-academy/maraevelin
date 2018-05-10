import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

     Scanner scanner = new Scanner(System.in);

     System.out.println("Convert kilometres to miles: ");

     int userInput = scanner.nextInt();

     double kmsToMiles = userInput * 0.62;

     System.out.println(userInput + " kilometers = " + kmsToMiles + " miles");
    }
}