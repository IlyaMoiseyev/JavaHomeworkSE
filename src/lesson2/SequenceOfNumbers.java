package lesson2;

/* Задание №4 из методички. Необходимо, чтоб программа выводила на экран вот такую
   последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
   В решении используйте цикл while. */

public class SequenceOfNumbers {
  public static void main(String[] args) {
    int multiplayer = 1;
    int number = 7;

    while (true) {
      System.out.print(number * multiplayer + " ");
      if (multiplayer == 14) {
        break;
      }
      multiplayer++;
    }
  }
}
