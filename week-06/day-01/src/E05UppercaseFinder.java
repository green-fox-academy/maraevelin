import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E05UppercaseFinder {

  public static void main(String[] args) {
    String example = "Write a Stream Expression to find the uppercase characters in a string!";
    getUppercaseCharacters(example);
  }

  private static void getUppercaseCharacters(String example) {
    example.chars()
        .mapToObj(character -> (char) character)
        .filter(Character::isUpperCase)
        .forEach(System.out::println);
  }

}
