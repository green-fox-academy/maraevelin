import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void add_should_returnSumOfTwoIntegers() {
    int input1 = 2;
    int input2 = 6;
    int expectedResult = 8;

    int result = extension.add(input1, input2);

    assertEquals(expectedResult, result);
  }

  @Test
  void maxOfThree_should_returnBigger() {
    int input1 = 6;
    int input2 = 10;
    int input3 = 3;
    int expectedResult = 10;

    int result = extension.maxOfThree(input1, input2, input3);

    assertEquals(expectedResult, result);
  }

  @Test
  void median_should_returnMedianValue() {
    List<Integer> inputList = new ArrayList<>();
    inputList = Arrays.asList(1, 3, 6, 4, 5, 2, 7, 8, 9, 1, 2, 3, 4);
    int expectedResult = 2;

    int result = extension.median(inputList);

    assertEquals(expectedResult, result);
  }

  @Test
  void isVowel_should_returnTrue_when_vowelInput() {
    char input1 = 'a';
    char input2 = 'e';

    boolean result1 = extension.isVowel(input1);
    boolean result2 = extension.isVowel(input2);

    assertTrue(result1);
    assertTrue(result2);
  }

  @Test
  void isVowel_should_returnFalse_when_consonantInput() {
    char input1 = 'b';
    char input2 = 'c';

    boolean result1 = extension.isVowel(input1);
    boolean result2 = extension.isVowel(input2);

    assertFalse(result1);
    assertFalse(result2);
  }

  @Test
  void isVowel_should_returnTrue_when_vowelInputUpperCase() {
    char input1 = 'A';
    char input2 = 'E';

    boolean result1 = extension.isVowel(input1);
    boolean result2 = extension.isVowel(input2);

    assertTrue(result1);
    assertTrue(result2);
  }

  @Test
  void isVowel_should_returnFalse_when_consonantInputUppercase() {
    char input1 = 'B';
    char input2 = 'C';

    boolean result1 = extension.isVowel(input1);
    boolean result2 = extension.isVowel(input2);

    assertFalse(result1);
    assertFalse(result2);
  }

  @Test
  void translate_should_return_lavalavalava() {
    String input = "kutya";
    String expectedResult = "kuvutyava";

    String result = extension.translate(input);

    assertEquals(expectedResult, result);
  }


//  @Test
//  void testTranslate_bemutatkozik() {
//    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
//  }
//
//  @Test
//  void testTranslate_lagopus() {
//    assertEquals("lavagovopuvus", extension.translate("lagopus"));
//  }
}