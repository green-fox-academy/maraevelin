// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.


public class FizzBuzz {
    public static void main(String[] args) {

        for (int numberSequence = 1; numberSequence < 101; numberSequence++ ) {
            if (numberSequence % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (numberSequence % 5 == 0) {
                System.out.println("Buzz");
            } else if (numberSequence % 3 == 0) {
                System.out.println("Fizz");
            }else {
                    System.out.println(numberSequence);
                }
            }
            }
        }