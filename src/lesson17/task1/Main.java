package lesson17.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Задача №1:
   Создать коллекцию класса ArrayList наполнить ee элементами типа Integer.
   С помощью Stream'oв:
   - Удалить дубликаты
   - Оставить только четные элементы
   - Вывести сумму оставшихся элементов в стриме. */

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> collectionOfNumbers = getPreparedCollectionOfNumbers();
    System.out.println("Изначальная коллекция:\n" + collectionOfNumbers);

    List<Integer> collectionAfterFilters = collectionOfNumbers.stream()
            .distinct()
            .filter(x -> x % 2 == 0)
            .toList();

    System.out.println("Коллекция после фильтрации:\n" + collectionAfterFilters);
    System.out.println("Сумма элементов оставшихся элементов: " +
            collectionAfterFilters.stream().reduce(0, Integer::sum));
  }

  public static ArrayList<Integer> getPreparedCollectionOfNumbers() {
    int numberOfElements = new Random().nextInt(15, 26);

    return Stream.generate(() -> new Random().nextInt(1, 11))
            .limit(numberOfElements)
            .collect(Collectors.toCollection(ArrayList<Integer>::new));
  }
}
