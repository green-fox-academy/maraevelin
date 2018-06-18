import java.util.ArrayList;
import java.util.Arrays;

public class E03SquareOfPositives {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getOddsAverage(numbers));
  }

  private static Integer getOddsAverage(ArrayList<Integer> numbers) {
    return numbers.stream()
        .filter(number -> number > 0)
        .mapToInt(number -> number)
        .map(number -> number * number)
        .sum();
  }

}
