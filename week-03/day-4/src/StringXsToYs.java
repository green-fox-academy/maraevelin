// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class StringXsToYs {
  public static void main(String[] args) {
    String original = "xsxdxf";
    String yToX = yForEveryone(original);
    System.out.println(original);
    System.out.println(yToX);
  }

  private static String yForEveryone(String xsxdxf) {
    if (xsxdxf.split("x").equals(xsxdxf)) {
      return xsxdxf;
    } else {
      return xsxdxf.replace("x", "y");
    }
  }
}