package lesson5;
import java.util.Random;
import java.util.Scanner;

/* Задача №1:
    1.1 Создать двумерный массив, заполнить его случайными числами.
    1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    1.3 Найти сумму всех получившихся элементов и вывести в консоль. */

public class SumOfElementsInTwoDimensionalArray {
  public static void main(String[] args) {
    Random randomNumber = new Random();
    Scanner scanner = new Scanner(System.in);
    int sumOfAllElements = 0;
    int[][] multiArray = new int[3][3];

    System.out.println("Изначальный масси заполненый рандомными значениями:");
    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        multiArray[i][j] = randomNumber.nextInt(1, 10);
        System.out.print(multiArray[i][j] + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        System.out.println("Введите число, которое хотите добавить к элементу в ячейке " + i + " " + j);
        multiArray[i][j] += scanner.nextInt();
        sumOfAllElements += multiArray[i][j];
      }
    }

    System.out.println("Массив после добавления чисел: ");
    for (int[] mass : multiArray) {
      for (int element : mass) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
    System.out.println("Сумма всех элементов массива: " + sumOfAllElements);
    scanner.close();
  }
}
