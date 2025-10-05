package lesson15.task1;

import java.util.HashMap;
import java.util.Map;

public abstract class RepeatingString {
  public static void startRepeatingStringProgram() {
    printMap(findRepeatingStrings(getPreparedArray()));
  }

  public static Map<String, Boolean> findRepeatingStrings(String[] inputString) {
    Map<String, Boolean> stringBooleanMap = new HashMap<>();

    for (String str : inputString) {
      if (!stringBooleanMap.containsKey(str)) {
        stringBooleanMap.put(str, false);
      } else {
        stringBooleanMap.put(str, true);
      }
    }
    return stringBooleanMap;
  }

  public static String[] getPreparedArray() {
    return new String[]{"d", "f", "e", "d", "q", "e"};
  }

  public static void printMap(Map<String, Boolean> map) {
    for (String key : map.keySet()) {
      System.out.println(key + " : " + map.get(key));
    }
  }
}
