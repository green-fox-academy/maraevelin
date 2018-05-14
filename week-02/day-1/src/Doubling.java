// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

public class Doubling {
  public static void main(String[] args) {
    int baseNum = 123;
    System.out.println(doubling(baseNum));
  }

  public static int doubling(int number) {
    //'int' must be used for 'return-type'
    // 'number' can be written, 'sout' in the main section will substitute it with the relevant element
    // 'void functions' can be used with souts (<=> 'return' functions)

    int doubleNum = (number *= 2);
    return doubleNum;

  }

}