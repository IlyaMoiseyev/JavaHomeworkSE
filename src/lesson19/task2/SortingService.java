package lesson19.task2;

import lesson19.task1.MaximumAndMinimumNumberService;
import java.util.Arrays;

public class SortingService {
  public static void startSorting() {
    int[] arrayOfNumbers = MaximumAndMinimumNumberService.getArrayWithNumbers();
    new Thread(new Sorter(insertSorting, arrayOfNumbers)).start();
    new Thread(new Sorter(choiceSorting, arrayOfNumbers)).start();
    new Thread(new Sorter(bubbleSorting, arrayOfNumbers)).start();
  }

  public static Sortable insertSorting = array -> {
    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      int previous = i - 1;

      while (previous >= 0 && array[previous] > current) {
        array[previous + 1] = array[previous];
        previous--;
      }
      array[previous + 1] = current;
    }
    System.out.println("Массив отсортированный вставкой: " + Arrays.toString(array));
  };

  public static Sortable choiceSorting = array -> {
    for (int i = 0; i < array.length - 1; i++) {
      int minValue = array[i];
      int tempMinIndex = i;

      for (int j = i + 1; j < array.length; j++) {
        if (minValue > array[j]) {
          minValue = array[j];
          tempMinIndex = j;
        }
      }
      if (tempMinIndex != i) {
        int tempValue = array[i];
        array[i] = minValue;
        array[tempMinIndex] = tempValue;
      }
    }
    System.out.println("Массив отсортированный выбором: " + Arrays.toString(array));
  };

  public static Sortable bubbleSorting = array -> {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int tempValue = array[j + 1];
          array[j + 1] = array[j];
          array[j] = tempValue;
        }
      }
    }
    System.out.println("Массив отсортированный пузырьком: " + Arrays.toString(array));
  };
}
