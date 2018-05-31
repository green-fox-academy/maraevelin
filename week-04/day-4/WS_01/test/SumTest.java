import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;

  @BeforeClass
  public static void init() {
    sum = new Sum();
  }

  @Test
  public void should_recieveEmptyList() {
    ArrayList<Integer> emptyList = new ArrayList<>();
    int expectedResult = 0;

    int result = sum.getSum(emptyList);

    assertEquals(expectedResult, result);

  }

}