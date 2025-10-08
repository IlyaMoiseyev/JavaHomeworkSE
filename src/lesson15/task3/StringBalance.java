package lesson15.task3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class StringBalance {
  public static void startCheckingBalanceProgram() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Пожалуйста введите строку состоящую из любой последовательности скобок:");
    String stringForCheck = scanner.nextLine();
    boolean isBalanced = checkStringBalanced(stringForCheck);

    if (isBalanced) {
      System.out.println("Введенная строка сбалансирована!");
    } else {
      System.out.println("Строка НЕ сбалансирована!");
    }
    scanner.close();
  }

  public static boolean checkStringBalanced(String inputString) {
    boolean isBalanced = false;
    LinkedHashMap<String, String> associativeMap;
    LinkedHashMap<String, String> secondAssociativeMap;

    if (inputString.length() % 2 != 0) {
      return isBalanced;
    } else {
      associativeMap = getFirstHalfOfAssociativeMap(inputString);
      secondAssociativeMap = getSecondHalfOfAssociativeMap(inputString);
      if (associativeMap != null && secondAssociativeMap != null) {
        isBalanced = compareAssociativeMaps(associativeMap, secondAssociativeMap);
      }
    }
    return isBalanced;
  }

  public static LinkedHashMap<String, String> getFirstHalfOfAssociativeMap(String inputString) {
    LinkedHashMap<String, String> firstHalfMap = new LinkedHashMap<>();
    char[] tempCharArray = inputString.toCharArray();

    for (int i = 0; i < inputString.length() / 2; i++) {
      String tempStr = String.valueOf(tempCharArray[i]);
      switch (tempStr) {
        case "}", "]", ")" -> {
          return null;
        }
        case "{" -> firstHalfMap.put(tempStr, "}");
        case "(" -> firstHalfMap.put(tempStr, ")");
        case "[" -> firstHalfMap.put(tempStr, "]");
      }
    }
    return firstHalfMap;
  }

  public static LinkedHashMap<String, String> getSecondHalfOfAssociativeMap(String inputString) {
    LinkedHashMap<String, String> secondHalfMap = new LinkedHashMap<>();
    char[] tempCharArray = inputString.toCharArray();

    for (int i = inputString.length() - 1; i >= inputString.length() / 2; i--) {
      String tempStr = String.valueOf(tempCharArray[i]);
      switch (tempStr) {
        case "{", "(", "[" -> {
          return null;
        }
        case "}" -> secondHalfMap.put(tempStr, "{");
        case ")" -> secondHalfMap.put(tempStr, "(");
        case "]" -> secondHalfMap.put(tempStr, "[");
      }
    }
    return secondHalfMap;
  }

  public static boolean compareAssociativeMaps(LinkedHashMap<String, String> firstMap,
                                               LinkedHashMap<String, String> secondMap) {
    Iterator<String> keyIterator = firstMap.keySet().iterator();
    Iterator<String> valueIterator = secondMap.values().iterator();

    while (keyIterator.hasNext() && valueIterator.hasNext()) {
      String tempKey = keyIterator.next();
      String tempValue = valueIterator.next();
      if (!tempKey.equals(tempValue)) {
        return false;
      }
    }
    return true;
  }
}
