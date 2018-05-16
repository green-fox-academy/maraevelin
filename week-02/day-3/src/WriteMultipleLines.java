// Create a function that takes 3 parameters
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// The function should not raise any error if it could not write the file.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a path (with filename!): ");
    String userPath = scanner.nextLine();

    System.out.println("Enter a word: ");
    String userWord = scanner.nextLine();

    System.out.println("Enter a number: ");
    int userNumber = scanner.nextInt();

    System.out.println(functionCreator(userPath, userWord, userNumber));

  }

  public static String functionCreator(String pathInput, String wordInput, int numberInput) {

    List<String> content = new ArrayList<>();
    for (int i = 0; i < numberInput; i++) {
      content.add(wordInput);
    }

    try {
      Path filePath = Paths.get(pathInput);
      Files.write(filePath, content);
      return "file was written";
    } catch (Exception e) {
      return "file could not be written";
    }

  }

}
