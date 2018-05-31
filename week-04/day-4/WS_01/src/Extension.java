import java.util.Arrays;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > a && b > c) {
      return b;
    } else {
      return c;
    }
  }

  int median(List<Integer> list) {
    if (list.size() % 2 == 0) {
      return list.get(list.size() / 2);
    } else {
      return list.get(list.size() / 2 - 1);
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(c);
  }

  String translate(String input) {
    String translation = input;
    int translationLength = getTranslationLength(input);
    for (int i = 0; i < translationLength; i++) {
      char vowel = translation.charAt(i);
      if (isVowel(vowel)) {
        String translationInput = "v" + vowel;
        translation.substring(i, i + 2).concat(translationInput);

//        translation.replaceFirst(vowel, translationInput);
//        input.replace(vowel,i, vowel + vTranslation + vowel);
      }
    }
    return translation;
  }

  int getTranslationLength(String input) {
    int vowelCounter = 0;
    for (int i = 0; i < input.length() - 1; i++) {
      if (isVowel(input.charAt(i))) {
        vowelCounter ++;
      }
    }
  return input.length() + 2 * vowelCounter;
  }
}