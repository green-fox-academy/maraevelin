import java.util.ArrayList;
import java.util.Arrays;

public class E06FirstALastIFinder {

  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    getFirstLetterALastLetterI(cities);
    getStartsWithAndEndsWith(cities);
  }

  private static void getStartsWithAndEndsWith(ArrayList<String> cities) {
    cities.stream()
        .filter(city -> city.startsWith("A") && city.endsWith("I"))
        .forEach(System.out::println);
  }

  private static void getFirstLetterALastLetterI(ArrayList<String> cities) {
    cities.stream()
        .filter(city -> city.charAt(0) == 'A' && city.charAt(city.length() - 1) == 'I')
        .forEach(System.out::println);
  }

}
