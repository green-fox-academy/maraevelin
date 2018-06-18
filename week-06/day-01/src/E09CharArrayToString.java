import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E09CharArrayToString {

  public static void main(String[] args) {
    List<Character> charArray = new ArrayList<Character>();
    charArray.add('a');
    charArray.add('b');
    charArray.add('c');
    charArray.add('d');

    System.out.println(charArrayToString(charArray));
  }

  private static String charArrayToString(List<Character> charArray) {
    return charArray.stream()
        .map(character -> character.toString())
        .collect(Collectors.joining());
  }

}
