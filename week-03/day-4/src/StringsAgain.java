// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class StringsAgain {
  public static void main(String[] args) {
    String givenString = "xsxdxfxgxh";
    String stringWithoutX =noX(givenString);
    System.out.println(givenString);
    System.out.println(stringWithoutX);
  }

  private static String noX(String givenString) {
  if (givenString.split("x").equals(givenString)) {
    return givenString;
  } else {
    return givenString.replace("x", "");
  }
  }
}
