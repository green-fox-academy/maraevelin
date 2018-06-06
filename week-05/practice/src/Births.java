// Create a function that
// - takes a filename as a parameter,
// - reads a csv file which rows contains data in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// - returns the year when the most births happend.

// You can find such a csv file in this directory: births.csv
// If you pass births.csv to your function, the result should be 2006.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Births {
  public static void main(String[] args) {
    int frequentBirthYear = getFrequency("births.csv");
    System.out.println("Most frequently birthed year: " + frequentBirthYear);

  }

  public static int getFrequency(String filename) {
    List<String> fileContent = readFileContent(filename);
    List<String> birthdates = getDates(fileContent);
    List<Integer> birthyears = getYear(birthdates);
    HashMap<Integer, Integer> mapOfYears = getFrequentYear(birthyears);
    Integer highestValueOfMap = getHighestValue(mapOfYears);
    System.out.println("IM WHAT YOU WANT: " + getKeyFromValue(mapOfYears, 5));

    return (int) getKeyFromValue(mapOfYears, 5);
  }


  public static Object getKeyFromValue(HashMap<Integer,Integer> hashmap, Object value) {
    for (Object o : hashmap.keySet()) {
      if (hashmap.get(o).equals(value)) {
        return o;
      }
    }
    return null;
  }

  private static Integer getHighestValue(HashMap<Integer,Integer> mapOfYears) {
    List<Integer> valueList = new ArrayList<>();
    valueList.addAll(mapOfYears.values());
    int temp = 1;
    for (int i = 0; i < valueList.size(); i++) {
      if (valueList.get(i) > temp) {
        temp = valueList.get(i);
      }
    }
    return temp;
  }

  public static HashMap<Integer, Integer> getFrequentYear(List<Integer> birthyears) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < birthyears.size(); i++) {
      if (!map.containsKey(birthyears.get(i))) {
        map.put(birthyears.get(i), 1);
      } else {
        map.put(birthyears.get(i), map.get(birthyears.get(i)) + 1);
        }
      }
      return map;
  }


  public static List<String> readFileContent(String filename) {
    List<String> fileRows = new ArrayList<>();
    try {
      fileRows = Files.readAllLines(Paths.get(filename));
      System.out.println("filereading is done");
    } catch (IOException e) {
      System.out.println("unable to read file");
    }
    return fileRows;
  }

  public static List<String> getDates(List<String> fileContent) {
    List<String> birthdates = new ArrayList<>();
    for (String row : fileContent) {
      birthdates.add(row.split(";")[1]);
    }
    return birthdates;
  }

  public static List<Integer> getYear(List<String> birthdates) {
    List<Integer> birthyears = new ArrayList<>();
    for (String row : birthdates) {
      birthyears.add(Integer.parseInt(row.split("-")[0]));
    }
    return birthyears;
  }

}