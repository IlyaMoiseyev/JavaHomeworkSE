package lesson19.task1;

import java.util.Arrays;

public class MaximumValueSearcher implements Runnable {
  private final int[] arrayOfNumbers;
  private int maximumValueInArray;

  public MaximumValueSearcher(int[] arrayOfNumbers) {
    this.arrayOfNumbers = arrayOfNumbers;
  }

  public int getMaximumValueInArray() {
    return maximumValueInArray;
  }

  @Override
  public void run() {
    System.out.println("Поиск максимального значения в массиве....");
    maximumValueInArray = Arrays.stream(arrayOfNumbers).max().getAsInt();
    System.out.println("Максимальное значение элемента в массиве найдено!");
  }
}
