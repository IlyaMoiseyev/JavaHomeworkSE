package lesson17.additionalTasks.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Задача №3. Подсчёт количества уникальных слов.
   Дан список строк List<String> lines. Нужно посчитать количество уникальных слов (без учёта регистра).
   Input:
   List<String> lines = List.of(
       "Stream API is powerful",
       "Java stream is powerful",
       "Powerful tools in Java"
   ); */

public class Main {
  public static void main(String[] args) {
    findUniqueStrings(getPreparedListOfStrings());
  }

  public static void findUniqueStrings(List<String> listOfStrings) {
    List<String> preparedList = listOfStrings.stream()
            .flatMap(str -> Arrays.stream(str.split(" ")))
            .map(String::toLowerCase)
            .toList();

    Map<String, Integer> mapOfCountingStrings = preparedList.stream().collect(Collectors.toMap(
            str -> str,
            str -> 1,
            Integer::sum
    ));

    Map<String, Integer> mapWithUniqueStrings = mapOfCountingStrings.entrySet().stream().
            filter(entry -> entry.getValue() == 1)
            .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue
            ));

    System.out.println("Уникальные строки:");
    mapWithUniqueStrings.forEach((str, integer) -> System.out.print(str + " "));
  }

  public static List<String> getPreparedListOfStrings() {
    return List.of(
            "Stream API is powerful",
            "Java stream is powerful",
            "Powerful tools in Java"
    );
  }
}
