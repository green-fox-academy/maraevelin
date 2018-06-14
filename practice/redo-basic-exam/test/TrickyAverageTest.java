import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TrickyAverageTest {

  @Test
  public void isIntegerListValid_should_returnFalse_when_EmptyListAsInput() {
    List<Integer> emptyList = new ArrayList<>();

    boolean result = TrickyAverage.isIntegerListValid(emptyList);

    assertFalse(result);

  }

  @Test
  public void integerListContainsOddAndEvenNumber_should_returnFalse_when_NoOddNumber() {
    List<Integer> emptyList = new ArrayList<>();
    emptyList.add(2);
    emptyList.add(4);
    emptyList.add(6);

    boolean result = TrickyAverage.isIntegerListValid(emptyList);

    assertFalse(result);

  }

  @Test
  public void getTrickyAvg_should_returnAverage_when_ValidIntegerList() {
    List<Integer> validIntegerList = new ArrayList<>();
    validIntegerList.add(1);
    validIntegerList.add(2);
    validIntegerList.add(3);
    validIntegerList.add(4);
    double expectedResult = 2.5;

    double result = TrickyAverage.getTrickyAvg(validIntegerList);

    assertEquals(expectedResult, result, 2);
  }

}