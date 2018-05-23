import java.util.ArrayList;
import java.util.List;

public class Actions {
  Sharpie sharpie = new Sharpie("yellow", 200);
  List<Sharpie> sharpieSet;
  ArrayList<Sharpie> usableSharpies = new ArrayList<>();
  ArrayList<Sharpie> emptySharpies = new ArrayList<>();

  public void countUsable() {
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.inkAmount > 0) {
        usableSharpies.add(sharpie);
      }
    }
  }

  public void removeTrash() {
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.inkAmount == 0) {
        emptySharpies.add(sharpie);
      }
    }
  }
}

