import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E03SquareOfPositives {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getSquaresOfPositives(numbers));
    System.out.println(getValueOfSquaresOfPositives(numbers));
  }

  private static int getValueOfSquaresOfPositives(ArrayList<Integer> numbers) {
    return numbers.stream()
        .filter(number -> number > 0)
        .mapToInt(number -> number)
        .map(number -> number * number)
        .sum();
  }

  private static List<Integer> getSquaresOfPositives(ArrayList<Integer> numbers) {
    return numbers.stream()
        .filter(number -> number > 0)
        .mapToInt(number -> number)
        .map(number -> number * number)
        .boxed()
        .collect(Collectors.toList());
  }

}
