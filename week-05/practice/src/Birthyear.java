    import java.io.File;
    import java.io.IOException;
    import java.util.*;

public class Birthyear {
  public static void main(String[] args) {
    String fileName = "births.csv";
    System.out.println(findYearWithMostBirths(fileName));
  }

  public static HashMap<String, Integer> readBirthDatesFromFile(String fileName) {
    try {
      Scanner fileScanner = new Scanner(new File(fileName));
      String[] currentLine;
      HashMap<String, Integer> birthdatesWithCounts = new HashMap<>();

      while (fileScanner.hasNext()) {
        currentLine = fileScanner.nextLine().split(";");
        String birthDate = currentLine[1].substring(0, 4);
        birthdatesWithCounts.merge(birthDate, 1, Integer::sum);
      }
      return birthdatesWithCounts;
    } catch (IOException e) {
      System.out.println("Couldn't read file");
      return null;
    }
  }

  public static String findYearWithMostBirths(String fileName) {
    return Collections.max(readBirthDatesFromFile(fileName).entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
  }
}