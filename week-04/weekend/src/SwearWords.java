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
    String fileContent = readFile(s);
    return removalCounter(fileContent, offensiveWords);
  }

  public static String readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    String fileContent = "";

    try {
      fileContent += Files.readAllLines(filePath);
      System.out.println("filereading done");
    } catch (IOException e) {
      System.out.println("Unable to read file");
    }
    return fileContent;
  }

  public static int removalCounter(String fileContent, ArrayList<String> offensiveWords) {
    int removalCounter = 0;
    ArrayList<String> fileCensored = new ArrayList(Arrays.asList(fileContent.toLowerCase().split(" ")));

    for (int i = 0; i < fileCensored.size(); i++) {
      for (int j = 0; j < offensiveWords.size(); j++) {
        if (fileCensored.get(i).contains(offensiveWords.get(j))) {
          fileCensored.remove(i);
          removalCounter++;
        }
      }
    }
    return removalCounter;
  }
}