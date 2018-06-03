import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {
    // There is a not so family friendly text in the `content.txt`
    // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
    // and remove all the given words from the file and returns the amount of the removed words.
    // should print out 17

    ArrayList<String> offensiveWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    System.out.println(familyFriendlizer("content.txt", offensiveWords));
  }

  public static int familyFriendlizer(String s, ArrayList<String> offensiveWords) {
    List<String> fileContent = readFile(s);
    List<String> fileCensored = removeOffensiveWords(fileContent, offensiveWords);
    return getAmountOfRemovedWords(fileContent, fileCensored);
  }

  public static List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> fileContent = new ArrayList<>();

    try {
      fileContent = Files.readAllLines(filePath);
      System.out.println("filereading done");
      } catch (IOException e) {
      System.out.println("Unable to read file");
    }
    return fileContent;
  }

  public static List<String> removeOffensiveWords(List<String> fileContent, ArrayList<String> offensiveWords) {
    List<String> fileCensored = new ArrayList<>();
    return fileCensored;
  }

  public static int getAmountOfRemovedWords (List < String > fileContent, List < String > fileCensored){
    return fileContent.size() - fileCensored.size();
  }
}