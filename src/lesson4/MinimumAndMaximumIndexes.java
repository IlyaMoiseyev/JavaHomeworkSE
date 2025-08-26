package lesson4;

// Задача №3. Найти индексы минимального и максимального элементов и вывести в консоль

public class MinimumAndMaximumIndexes {
  public static void main(String[] args) {
    int[] array = ArrayForAllClasses.getArray();
    int maxIndex = 0;
    int minIndex = 0;
    int maxNumber = 0;
    int minNumber;

    for (int i = 0; i < array.length; i++) {
      if (maxNumber < array[i]) {
        maxNumber = array[i];
        maxIndex = i;
      }
    }

    minNumber = maxNumber;

    for (int i = 0; i < array.length; i++) {
      if (minNumber > array[i]) {
        minNumber = array[i];
        minIndex = i;
      }
    }
    System.out.println("Максимальное значение элемента массива: " + maxNumber + ", индекс эллемента: " + maxIndex);
    System.out.println("Минимальное значение элемента массива: " + minNumber + ", индекс эллемента: " + minIndex);
  }
}
