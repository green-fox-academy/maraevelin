import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
  static Sharpie sharpie;

  @BeforeClass
  public static void init() {
    sharpie = new Sharpie();
  }
}