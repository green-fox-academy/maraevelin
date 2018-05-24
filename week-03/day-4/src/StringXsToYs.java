// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class StringXsToYs {
  public static void main(String[] args) {
    String original = "xsxdxfxg";
    String newString = function(original);
    System.out.println(newString);
  }

  private static String function(String original) {
    System.out.println(original);
    if (original.length() == 0) {
      return "";
    } else {
      if (original.substring(0,1).equals("x")) {
        return "y" + function(original.substring(1));
      } else {
        return original.substring(0,1) + function(original.substring(1));
      }
    }
  }
}
