//import java.util.*;
//
//public class Matchmaking{
//  public static void main(String... args){
//    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
//    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
//
//    // Write a method that joins the two lists by matching one girl with one boy into a new list
//    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
//
//    System.out.println(makingMatches(girls, boys));
//  }
//}

import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

    System.out.println(makingMatches(girls, boys));

  }

  public static ArrayList makingMatches(ArrayList inputList1, ArrayList inputList2) {

    ArrayList<String> newList = new ArrayList<>();

    for (int i = 0; i < inputList1.size(); i++) {
        newList.add(inputList1.get(i).toString());
        newList.add(inputList2.get(i).toString());

    }
    return newList;
  }
}
