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
    String translation = "";
    for (char character :
        input.toCharArray()) {
      translation = translation + character;
      if (isVowel(character)) {
        translation += "v" + character;
      }
    }
  return translation;
  }
}

//  String translate(String input) {
//    String translation = input;
//    int translationLength = getLength(input);
//    for (int i = 0; i < translationLength; i++) {
//      char vowel = translation.charAt(i);
//      if (isVowel(vowel)) {
//        translation = String.join(vowel + "v" + vowel, translation.split(""+vowel));
//        i += 2;
//      }
//    }
//    return translation;
//  }
//
//  int getLength(String input) {
//    int vowelCounter = 0;
//    for (int i = 0; i < input.length(); i++) {
//      if (isVowel(input.charAt(i))) {
//        vowelCounter++;
//      }
//    }
//    return input.length() + 2 * vowelCounter;
//  }
//}
