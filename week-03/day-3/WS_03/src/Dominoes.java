import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    for (int i = 1; i < dominoes.size(); i++) {
      for (int j = i; j < dominoes.size(); j++) {
        if (dominoes.get(i - 1).getValues()[1] == dominoes.get(j).getValues()[0]) {
          Domino temp = dominoes.get(j);
          dominoes.remove(j);
          dominoes.add(i, temp);
        }
      }
    }

    System.out.println(dominoes.toString());

  }


  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}