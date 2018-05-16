//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Files;
//import java.util.List;
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

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

 public static void main(String[] args) {
   String fileName = "filename.txt";

   System.out.println(lineCounter(fileName));
 }

 public static String lineCounter (String inputFileName) {

   try {
     Path filePath = Paths.get(inputFileName);
     List<String> lines = Files.readAllLines(filePath);
     Integer numberOfLinesInFile = lines.size();
     String result = numberOfLinesInFile.toString();
     return result;
   }
   catch (IOException e) {
     return "0";
   }

 }

}