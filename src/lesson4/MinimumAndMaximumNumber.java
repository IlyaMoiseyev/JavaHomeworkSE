package lesson4;

// Задача №2. Найти минимальный-максимальный элементы и вывести в консоль.

public class MinimumAndMaximumNumber {
  public static void main(String[] args) {
    int[] array = ArrayForAllClasses.getArray();
    int maxNumber = 0;

    for (int num : array) {
      if (maxNumber < num) maxNumber = num;
    }

    int minNumber = maxNumber;

    for (int num : array) {
      if (minNumber > num) minNumber = num;
    }

    System.out.println("Максимальное число/цифра в массиве: " + maxNumber);
    System.out.println("Минимальное число/цифра в массиве: " + minNumber);
  }
}
