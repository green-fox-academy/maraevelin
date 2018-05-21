import java.util.*;

public class Unique {
  public static void main(String[] args) {

    System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
  }

  public static List<Integer> unique(int[] list) {
    Arrays.sort(list);

    List<Integer> uniqueList = new ArrayList<>();

    for (int i = 0; i < list.length; i++) {
      if (i < list.length - 1 && list[i] == list[i + 1]) {
      } else {
        uniqueList.add((list[i]));
      }
    }
    return uniqueList;
  }
}
