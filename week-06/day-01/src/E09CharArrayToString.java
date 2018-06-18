import java.util.ArrayList;
import java.util.Arrays;
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

    Character[] characterArray = new Character[] {'A', 'E', 'I', 'O', 'U', 'Y'};

    System.out.println(arrayToString(characterArray));
  }

  private static String arrayToString(Character[] characterArray) {
    return Arrays.stream(characterArray)
        .map(character -> Character.toString(character))
        .reduce((word, letter) -> word + letter)
        .get();
  }


  private static String charArrayToString(List<Character> charArray) {
    return charArray.stream()
        .map(character -> character.toString())
        .collect(Collectors.joining());
//        .map(character -> character.toString())
//        .reduce((word, letter) -> word + letter)
//        .get();
  }

}
