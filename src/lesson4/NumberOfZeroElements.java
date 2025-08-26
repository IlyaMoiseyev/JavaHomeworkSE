package lesson4;

/* Задача №4. Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
   сообщение, что их нет. */

public class NumberOfZeroElements {
  public static void main(String[] args) {
    int[] array = ArrayForAllClasses.getArray();
    int countOfZeros = 0;

    for (int num : array) {
      if (num == 0) countOfZeros++;
    }

    if (countOfZeros > 0) {
      System.out.println("Количество элементов с нулевым значением: " + countOfZeros);
    } else {
      System.out.println("Элементов с нулевым значением нет.");
    }
  }
}
