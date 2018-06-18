//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E02OddsAverage {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getOddsAverage(numbers));
  }

  private static double getOddsAverage(ArrayList<Integer> numbers) {
    return numbers.stream()
        .filter(number -> number % 2 != 0)
        .mapToInt(number -> number)
        .average()
        .getAsDouble();
  }

}
