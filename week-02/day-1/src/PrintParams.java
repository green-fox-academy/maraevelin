//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

public class PrintParams {
  public static void main(String[] args) {
    printParams("first", "second", "dog", "pupper");
  }

  public static void printParams(String... parameterStrings) {
    for (String row : parameterStrings) {
      System.out.println(row);
    }

  }

}