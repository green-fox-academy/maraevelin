import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostProductiveYear {
  public static void main(String[] args) {
    getYearWithMostProduction("paramount");
    getYearWithMostProduction("marvel");

  }

  public static void getYearWithMostProduction(String studioname) {
    List<String> studioData = readFileContent(studioname);
    List<String> productionYears = getProductionYears(studioData);
    Map<String, Integer> productionYearsWithCount = getProductionYearCount(productionYears);
    Integer highestProductionRate = getYearWithHighestProductionRate(productionYearsWithCount);
    String yearWithMostProduction = getBusiestYear(productionYearsWithCount, highestProductionRate);
    System.out.println(studioname + " has made the most movies in " + yearWithMostProduction);
  }

  public static String getBusiestYear(Map<String, Integer> productionYearsWithCount, Integer productionRate) {
    for (String productionYears : productionYearsWithCount.keySet()) {
      if (productionYearsWithCount.get(productionYears).equals(productionRate)) {
        return productionYears;
      }
    }
    return null;
  }


  public static int getYearWithHighestProductionRate(Map<String, Integer> productionYearsWithCount) {
    List<Integer> productionRates = new ArrayList<>();
    productionRates.addAll(productionYearsWithCount.values());
    int highestProductionRate = 1;
    for (int i = 0; i < productionRates.size(); i++) {
      if (productionRates.get(i) > highestProductionRate) {
        highestProductionRate = productionRates.get(i);
      }
    }
    return highestProductionRate;

  }

  public static Map<String, Integer> getProductionYearCount(List<String> productionYears) {
    HashMap<String, Integer> productionYearsWithCount = new HashMap<String, Integer>();
    for (int i = 0; i < productionYears.size(); i++) {
      if (!productionYearsWithCount.containsKey(productionYears.get(i))) {
        productionYearsWithCount.put(productionYears.get(i), 1);
      } else {
        productionYearsWithCount.put(productionYears.get(i), productionYearsWithCount.get(productionYears.get(i)) + 1);
      }
    }
    return productionYearsWithCount;
  }

  public static List<String> getProductionYears(List<String> studioData) {
    List<String> productionYears = new ArrayList<>();
    for (String row : studioData) {
      productionYears.add(row.split(",")[1]);
    }
    return productionYears;
  }

  public static List<String> readFileContent(String studioname) {
    List<String> fileRows = new ArrayList<>();
    try {
      fileRows = Files.readAllLines(Paths.get(studioname + ".csv"));
      System.out.println("filereading complete");
    } catch (IOException e) {
      System.out.println("Cannot find studio, please try again later.");
    }
    return fileRows;
  }

}