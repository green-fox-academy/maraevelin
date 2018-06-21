import java.util.Arrays;

public class CheckStuff {

  public static void main(String[] args) {

    String[] stuff = new String[] {"-", "r", " ", "2", "8"};
    String newStuff = "";

    for (int i = 0; i < stuff.length; i++) {
      newStuff += stuff[i];
    }

    System.out.println(stuff.length);
    System.out.println(newStuff);

  }

}
