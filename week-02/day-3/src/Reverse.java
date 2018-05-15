//public class Reverse {
//  public static void main(String... args){
//    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
//
//    // Create a method that can reverse a String, which is passed as the parameter
//    // Use it on this reversed string to check it!
//    // Try to solve this using charAt() first, and optionally anything else after.
//
//    System.out.println(reverse(reversed));
//  }
//}

public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(fcReverse(reversed));

  }

  public static String fcReverse(String input) {

    String stringOutput = "";
    for (int i = 0; i < input.length(); i++) {
      char x = input.charAt(input.length() - 1 - i);
      stringOutput = stringOutput.concat(String.valueOf(x));
    }

    return stringOutput;
  }

}