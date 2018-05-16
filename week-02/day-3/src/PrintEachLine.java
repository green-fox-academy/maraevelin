//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Files;
//
//public class ReadFile {
//  public static void main(String[] args) {
//    try { // Required by Files.readAllLines(filePath);
//      // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
//      Path filePath = Paths.get("assets/lorem-ipsum.txt");
//      List<String> lines = Files.readAllLines(filePath);
//      System.out.println(lines.get(0)); // Prints the first line of the file
//    } catch (Exception e) {
//      System.out.println("Uh-oh, could not read the file!");
//    }
//  }
//}


// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main (String[] args) {
    try {
      Path filePath = Paths.get("my-file.txt");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.get(0));

    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }

    }

}