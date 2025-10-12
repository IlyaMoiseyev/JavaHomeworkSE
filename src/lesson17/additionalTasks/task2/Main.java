package lesson17.additionalTasks.task2;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/* Задача №2: Сумма чисел, кратных 3 или 5.
Дан список List<Integer> numbers. Найти сумму всех чисел, кратных 3 или 5. */

public class Main {
  public static void main(String[] args) {
    findSum(getPreparedListOfIntegers());
  }

  public static void findSum(List<Integer> listOfNumbers) {
    System.out.println("Изначальная коллекция элементов:");
    listOfNumbers.forEach(e -> System.out.print(e + " "));

    System.out.println("\nЭлементы удовлетворяющие параметрам фильтрации:");
    listOfNumbers.stream()
            .filter(i -> i % 3 == 0 || i % 5 == 0)
            .forEach(e -> System.out.print(e + " "));

    int sum = listOfNumbers.stream()
            .filter(i -> i % 3 == 0 || i % 5 == 0)
            .reduce(0, Integer::sum);
    System.out.println("\nСумма элементов: " + sum);
  }

  public static List<Integer> getPreparedListOfIntegers() {
    int randomNumber = new Random().nextInt(10, 21);
    return Stream.generate(() -> randomNumber)
            .limit(randomNumber)
            .map(i -> new Random().nextInt(1, 21))
            .toList();
  }
}
