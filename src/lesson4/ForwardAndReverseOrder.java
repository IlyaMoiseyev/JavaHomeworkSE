package lesson4;

// Задача №1. Пройти по массиву, вывести все элементы в прямом и в обратном порядке.

public class ForwardAndReverseOrder {
  public static void main(String[] args) {
    int[] arrayOfNumbers = ArrayForAllClasses.getArray();

    System.out.print("Прямой порядок: ");
    for (int num : arrayOfNumbers) {
      System.out.print(num + " ");
    }

    System.out.println();

    System.out.print("Обратный поряок: ");
    for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
      System.out.print(arrayOfNumbers[i] + " ");
    }
  }
}
