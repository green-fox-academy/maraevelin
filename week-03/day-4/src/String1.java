// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
  public static void main(String[] args) {
    String yToX = yForEveryone("xsxdxf");
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