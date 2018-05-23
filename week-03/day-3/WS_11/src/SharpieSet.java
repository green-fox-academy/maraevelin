import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }

  public int countUsable() {
    int usable = 0;

    for (Sharpie sharpie : sharpies) {
      if (sharpie.inkAmount > 0) {
        usable++;
      }
    }
    return  usable;
  }

  public int removeTrash() {
    int empty = 0;
    for (int i = 0; i < sharpies.size() ; i++) {
      if (sharpies.get(i).inkAmount == 0) {
        sharpies.remove(i);
        empty++;
      }
    }
    return empty;
  }
}