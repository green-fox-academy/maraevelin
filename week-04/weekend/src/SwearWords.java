import java.util.ArrayList;
import java.util.Arrays;

public class SwearWords {

  public static void main(String[] args) {
    // There is a not so family friendly text in the `content.txt`
    // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
    // and remove all the given words from the file and returns the amount of the removed words.
    // should print out 17

    ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    System.out.println(familyFriendlizer("content.txt", offensiveWords));
  }

  private static int familyFriendlizer(String s, ArrayList<String> offensiveWords) {
  }
}