import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
public class AppleTest {

  static Apple apple;

  @BeforeClass
  public static void init() {
    apple = new Apple();
  }

  @Test
  public void should_returnString() {
    String expectedResult = "apple";

    String result = apple.getApple();

    assertEquals(expectedResult, result);

  }

  @Test
  public void should_fail() {
    String expectedResult = "pear";

    String result = apple.getApple();

    assertEquals(expectedResult, result);

  }

}