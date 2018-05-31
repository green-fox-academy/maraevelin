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
  public void should_return0() {
    ArrayList<Integer> emptyList = new ArrayList<>();
    int expectedResult = 0;

    int result = sum.getSum(emptyList);

    assertEquals(expectedResult, result);

  }

  @Test
  public void should_returnOneElementList() {
    ArrayList<Integer> oneElementList = new ArrayList<>();
    oneElementList.add(100);
    int expectedResult = 100;

    int result = sum.getSum(oneElementList);

    assertEquals(expectedResult, result);

  }

  @Test
  public void should_returnMultipleElementList() {
    ArrayList<Integer> oneElementList = new ArrayList<>();
    oneElementList.add(100);
    oneElementList.add(200);
    oneElementList.add(300);
    int expectedResult = 600;

    int result = sum.getSum(oneElementList);

    assertEquals(expectedResult, result);

  }

  @Test
  public void should_returnNull() {
    ArrayList<Integer> oneElementList = new ArrayList<>();
    oneElementList = null;

    int expectedResult = 0;

    int result = sum.getSum(oneElementList);

    assertEquals(expectedResult, result);

  }


}