//// Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class StringsAgain {
  public static void main(String[] args) {
    String original = "xsxdxfxg";
    String newString = function(original);
    System.out.println(newString);
  }

  private static String function(String original) {
    if (original.length() == 0) {
      return "";
    } else {
      if (original.substring(0, 1).equals("x")) {
        return "" + function(original.substring(1));
      } else {
        return original.substring(0, 1) + function(original.substring(1));
      }
    }
  }
}