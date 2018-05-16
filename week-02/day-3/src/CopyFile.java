// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {

    System.out.println(fxCopy("futurama.txt", "simpons.txt"));

  }

  public static boolean fxCopy(String originalFile, String copyFile) {

    Path pathOriginal = Paths.get(originalFile);
    Path pathCopy = Paths.get(copyFile);

    try {
      List<String> contentOriginal = Files.readAllLines(pathOriginal);
      Files.write(pathCopy, contentOriginal);
      return true;
    } catch (Exception e) {
      System.out.println("the copy was not successful");
      return false;
    }
  }
}
