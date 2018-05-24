// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class StringsAgainAgain {
  public static void main(String[] args) {
    String original = "xsxdxfxg";
    String newString = function(original);
    System.out.println(newString);
  }

  private static String function(String original) {
    if (original.length() == 0) {
      return "";
    } else {
      return
          original.substring(0,1)
          + "*" + function(original.substring(1));
    }
  }
}