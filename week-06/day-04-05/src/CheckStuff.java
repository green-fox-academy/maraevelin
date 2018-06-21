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

    System.out.println(newStuff.substring(3));
    Integer argument = Integer.valueOf(newStuff.replace("-r ", ""));

    System.out.println(argument);

    Integer numbi = Integer.valueOf(newStuff.substring(3));
    System.out.println(numbi);
  }

}
