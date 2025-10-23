package lesson16.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public abstract class SearchPositiveNumbers {
  public static void startSearchPositiveNumbers() {
    searchPositiveNumbers(getDefaultArrayOfNumbers());
  }

  public static void searchPositiveNumbers(int[] arrayOfNumbers) {
    Predicate<Integer> isPositive = i -> i > 0;
    System.out.println("Массив: " + Arrays.toString(arrayOfNumbers));

    System.out.print("Положительные элементы массива: ");
    for (int number : arrayOfNumbers) {
      if (isPositive.test(number)) {
        System.out.print(number + " ");
      }
    }
  }

  public static int[] getDefaultArrayOfNumbers() {
    int randomIndex = new Random().nextInt(21);
    int[] arrayOfNumbers = new int[randomIndex];

    for (int i = 0; i < arrayOfNumbers.length; i++) {
      arrayOfNumbers[i] = new Random().nextInt(-21, 21);
    }
    return arrayOfNumbers;
  }
}
