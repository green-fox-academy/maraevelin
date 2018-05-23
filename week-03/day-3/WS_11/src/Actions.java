import java.util.ArrayList;
import java.util.List;

public class Actions {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("yellow", 200);
    Sharpie sharpie2 = new Sharpie("green", 100);
    Sharpie sharpie3 = new Sharpie("blue", 50);
    Sharpie sharpie4 = new Sharpie("red", 0);
    for (int i = 0; i < (100/5); i++) {
      sharpie4.use();
    }


    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.sharpies.add(sharpie1);
    sharpieSet.sharpies.add(sharpie2);
    sharpieSet.sharpies.add(sharpie3);
    sharpieSet.sharpies.add(sharpie4);

    System.out.println(sharpieSet.countUsable());
    System.out.println(sharpieSet.removeTrash());
  }
}

