import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class E07CharFrequencyFinder {

  public static void main(String[] args) {

    String example = "Write a Stream Expression to find the frequency of characters in a given string!";
    System.out.println((getCharFrequency(example)));
  }

  private static Map<Character, Integer> getCharFrequency(String example) {
    return example.chars()
        .mapToObj(character -> (char) character)
        .collect(Collectors.toConcurrentMap(character -> character, character -> 1, Integer::sum));
  }

}
