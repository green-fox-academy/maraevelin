import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class E07CharFrequencyFinder {

  public static void main(String[] args) {

    String example = "Write a Stream Expression to find the frequency of characters in a given string!";
    System.out.println((getCharFrequency(example)));
    System.out.println(getCharFreq(example));
    System.out.println(getCharFrequencyAgain(example));

    getCharFrequencyAgain(example).forEach((key, value) -> System.out.println(key + ": " + value));

  }

  private static Map<Character, Integer> getCharFrequencyAgain(String example) {
    return example.chars()
        .boxed()
        .collect(toMap(k -> Character.valueOf((char) k.intValue()), v -> 1, Integer::sum));
  }

  private static Map<Character, Long> getCharFreq(String example) {
    return example.chars()
        .mapToObj(character -> (char) character)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  private static Map<Character, Integer> getCharFrequency(String example) {
    return example.chars()
        .mapToObj(character -> (char) character)
        .collect(Collectors.toConcurrentMap(character -> character, character -> 1, Integer::sum));
  }

}
