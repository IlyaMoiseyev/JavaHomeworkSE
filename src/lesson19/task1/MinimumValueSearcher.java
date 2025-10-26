package lesson19.task1;

import java.util.Arrays;

public class MinimumValueSearcher implements Runnable {
  private final int[] arrayOfNumbers;
  private int minimumValueInArray;

  public MinimumValueSearcher(int[] arrayOfNumbers) {
    this.arrayOfNumbers = arrayOfNumbers;
  }

  public int getMinimumValueInArray() {
    return minimumValueInArray;
  }

  @Override
  public void run() {
    System.out.println("Поиск минимального значения в массиве....");
    minimumValueInArray = Arrays.stream(arrayOfNumbers).min().getAsInt();
    System.out.println("Минимальное значение элемента в массиве найдено!");
  }
}
