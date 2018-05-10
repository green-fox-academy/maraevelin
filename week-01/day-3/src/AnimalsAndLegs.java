import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens does the farmer have?");
        int userInput1 = scanner.nextInt();

        System.out.println("How many pigs does the farmer have?");
        int userInput2 = scanner.nextInt();

        int legsOfChickens = userInput1 * 2;
        int legsOfPigs = userInput2 * 4;
        int legsOfAnimals = legsOfChickens + legsOfPigs;

        System.out.println("The chickens and the pigs have " + legsOfAnimals + " legs together.");
    }
}


