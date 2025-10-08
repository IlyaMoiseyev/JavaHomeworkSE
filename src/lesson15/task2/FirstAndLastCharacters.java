package lesson15.task2;

import java.util.HashMap;
import java.util.Map;

public abstract class FirstAndLastCharacters {
  public static void startFirstAndLastCharactersProgram() {
    System.out.println(getMapWithFirstAndLastCharacters(getPreparedArray()));
  }

  public static Map<String, String> getMapWithFirstAndLastCharacters(String[] inputArray) {
    Map<String, String> firstAndLastCharMap = new HashMap<>();

    for (String str : inputArray) {
      String firstChar = String.valueOf(str.charAt(0));
      String lastChar = String.valueOf(str.charAt(str.length() - 1));
      firstAndLastCharMap.put(firstChar, lastChar);
    }
    return firstAndLastCharMap;
  }

  public static String[] getPreparedArray() {
    return new String[]{"moon", "man", "fuel", "car", "lol", "eight"};
  }
}
