import java.util.ArrayList;
import java.util.List;

public class Domino implements Printable {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public void printAllFields() {
    List<Domino> dominoes = new ArrayList<>();
    for (Domino d : dominoes) {
      d.printAllFields();
    }
  }
}