import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class E08NumberFrequency {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    System.out.println(getNumberFrequency(numbers));
    System.out.println(getNumberFrequencyMethod2(numbers));
  }

  private static Map<String, Integer> getNumberFrequencyMethod2(ArrayList<Integer> numbers) {
    return numbers.stream()
        .collect(Collectors.toConcurrentMap(Integer -> String.valueOf(Integer), string -> 1, Integer::sum));
  }

  private static Map<String, Integer> getNumberFrequency(ArrayList<Integer> numbers) {
    return numbers.stream()
        .collect(toMap(k -> String.valueOf(k.intValue()), v -> 1, Integer::sum));
  }

}
