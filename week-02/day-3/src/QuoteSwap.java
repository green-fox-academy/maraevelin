// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().

// Also, print the sentence to the output with spaces in between.

// Expected output: "What I cannot create I do not understand."

import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

//    System.out.println(list.indexOf("do"));
//    System.out.println(list.indexOf("cannot"));

    System.out.println(quoteSwap(list));

  }

  public static String quoteSwap(ArrayList inputQuote) {

    ArrayList<String> temporalList = new ArrayList<>();

    for (int i = 0; i < inputQuote.size(); i++) {
      temporalList.add(inputQuote.get(i).toString());
      }

    inputQuote.set(2, inputQuote.get(5));
    inputQuote.set(5, temporalList.get(2));


    String listPseudo = "";

    for (int i = 0; i < inputQuote.size(); i++) {
            listPseudo = listPseudo + inputQuote.get(i) + " ";
    }

    return listPseudo;

  }

}