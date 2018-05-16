//import java.util.*;
//
//public class AppendLetter{
//  public static void main(String... args){
//    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
//    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
//    // The parameter should be a list.
//
//    System.out.println(appendA(far));
//  }
//}
//
//// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"


import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    System.out.println(appendA(far));

  }

  public static ArrayList appendA(ArrayList alInput) {
    ArrayList<String> newAlList = new ArrayList<>();

    for (int i = 0; i < alInput.size(); i++) {
      newAlList.add(alInput.get(i)+"a");

    }

    return newAlList;
  }
}
