package E10OO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Franci", "Pallida", "black"));
    foxes.add(new Fox("Juci", "NotPallida", "yellow"));
    foxes.add(new Fox("Dani", "Pallida", "green"));
    foxes.add(new Fox("Attila", "NotPallida", "red"));
    foxes.add(new Fox("Peti", "Pallida", "blue"));

    System.out.println("Pallida fox(es): " + findPallida(foxes));
    System.out.println("Green pallida fox(es): " + findPallidaAndGreen(foxes));
    ;
  }

  private static String findPallida(List<Fox> foxes) {
    return foxes.stream()
        .filter(fox -> fox.getType().equalsIgnoreCase("pallida"))
        .map(fox -> fox.getName())
//        .collect(Collectors.toList());
        .collect(Collectors.joining(", "));
  }

  private static String findPallidaAndGreen(List<Fox> foxes) {
    return foxes.stream()
        .filter(fox -> fox.getType().equalsIgnoreCase("pallida") && fox.getColour().equalsIgnoreCase("green"))
        .map(fox -> fox.getName())
//        .collect(Collectors.toList());
        .collect(Collectors.joining(", "));
  }

}
