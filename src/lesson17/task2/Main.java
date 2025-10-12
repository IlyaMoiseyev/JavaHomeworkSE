package lesson17.task2;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Задача №2*:
   Создать набор данных в формате id-name, сохраненный в Мар. Необходимо отобрать из
   этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
   Среди отобранных значений отобрать только те, которые имеют нечетное количество
   букв в имени. После чего вернуть список List имен, записанных буквами задом наперед. */

public class Main {
  public static void main(String[] args) {
    Map<Integer, String> members = getPreparedMap();
    System.out.println("Изначальная карта:\n" + members);

    List<String> names = members.entrySet().stream()
            .filter(entry -> entry.getKey() == 1
                    || entry.getKey() == 2
                    || entry.getKey() == 5
                    || entry.getKey() == 8
                    || entry.getKey() == 9
                    || entry.getKey() == 13)
            .filter(entry -> entry.getValue().length() % 2 != 0)
            .map(entry -> {
              int key = entry.getKey();
              StringBuilder sb = new StringBuilder(entry.getValue());
              sb.reverse();
              return Map.entry(key, sb.toString());
            }).map(Map.Entry::getValue).toList();

    if (!names.isEmpty()) {
      System.out.println("Элементы карты подходящие по условию:\n" + names);
    } else{
      System.out.println("Элементы карты подходящие по условию не обнаружены!");
    }
  }

  public static Map<Integer, String> getPreparedMap() {
    return Stream.generate(() -> Map.entry(getRandomId(), getRandomName()))
            .limit(getRandomNumberOfMembers())
            .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (v1, v2) -> v2
            ));
  }

  public static int getRandomNumberOfMembers() {
    return new Random().nextInt(10, 26);
  }

  public static int getRandomId() {
    return new Random().nextInt(1, 26);
  }

  public static String getRandomName() {
    String[] defaultNames = {
            "Иван", "Валерий", "Дмитрий", "Инокентий", "Ибрагим", "Пантилимон", "Виктория", "Анна",
            "Константин", "Александр", "Михаил", "Сергей", "Екатерина", "Светлана", "Ульяна", "Ян",
            "Мария", "Инна", "Григорий", "Алёна", "Ярослав", "Лариса", "Степан", "Зинаида", "Антон",
            "Надежда", "Лариса", "Аркадий", "Эльвира", "Милана", "Борис", "София"
    };
    int index = new Random().nextInt(defaultNames.length);
    return defaultNames[index];
  }
}
