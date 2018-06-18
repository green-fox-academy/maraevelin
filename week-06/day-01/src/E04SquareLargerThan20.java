import java.util.ArrayList;
import java.util.Arrays;

public class E04SquareLargerThan20 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    numbers.stream()
        .map(number -> number * number)
        .filter(number -> number > 20)
        .forEach(System.out::println);

  }

}