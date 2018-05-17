//import java.lang.reflect.Array;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//public class Logs {
//
//  public static void main(String[] args) {
//    String txtLogs = "logs.txt";
//    Path pathLogs = Paths.get(txtLogs);
//
//    System.out.println(fxUniqueIP("logs.txt"));
//    System.out.println(fxGetPostRatio("logs.txt"));
//  }
//
//  public static Array fxUniqueIP (String input) {
//
//    try {
//      Path pathInput = Paths.get(input);
//      List<String> lines = Files.readAllLines(pathInput);
//      for (int i = 0; i < lines.size(); i++) {
//        System.out.println(lines.get(i));
//      }
//
//    }
//  }
//
//  public static int fxGetPostRatio (String inputFile) {
//
//  }
//
//}
