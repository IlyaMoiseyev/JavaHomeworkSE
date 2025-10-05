package lesson15.additionalTasks.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class GroupingByWordLength {
  public static void startGroupingWordsProgram() {
    groupingWordByLength(getPreparedArrayOfWords());
  }

  public static void groupingWordByLength(String[] arrayOfWords) {
    HashMap<Integer, ArrayList<String>> wordsMap = new HashMap<>();

    for (String str : arrayOfWords) {
      if (!wordsMap.containsKey(str.length())) {
        wordsMap.put(str.length(), new ArrayList<>());
      }
      wordsMap.get(str.length()).add(str);
    }
    printGroupingWords(wordsMap);
  }

  public static String[] getPreparedArrayOfWords() {
    return new String[]{
            "кот", "ягода", "кит", "пони", "нога", "рука",
            "город", "огород", "стрела", "повод", "транс"
    };
  }

  public static void printGroupingWords(HashMap<Integer, ArrayList<String>> wordsMap) {
    for (Map.Entry<Integer, ArrayList<String>> entry : wordsMap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue().toString());
    }
    System.out.println("------------------------");
  }
}
