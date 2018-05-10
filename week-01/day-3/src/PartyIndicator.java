// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
//
// If the the number of girls and boys are equal and there are more people coming than 20
// It should print: The party is excellent!
//
// If there are more than 20 people coming but the girl - boy ratio is not 1-1//
// It should print: Quite cool party!
//
// If there are less people coming than 20//
// It should print: Average party...
//
// If no girls are coming, regardless the count of the people
// It should print: Sausage party


import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many girls are coming to the party?");
        int userInput1 = scanner.nextInt();

        System.out.println("How many boys are coming to the party?");
        int userInput2 = scanner.nextInt();

        int partyPeople = userInput1 + userInput2;
        int GirlBoyRatio = userInput1 / userInput2;

        if (userInput1 == 0) {
            System.out.println("Sausage party");
        } else if (partyPeople < 20) {
            System.out.println("Average party...");
        } else if (partyPeople > 20 && GirlBoyRatio < 1) {
            System.out.println("Quite cool party!");
        } else {
            System.out.println("The party is excellent!");
        }

    }
}
