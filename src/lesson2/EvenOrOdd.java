package lesson2;
import java.util.Scanner;

/* Задача №1 из методички. Напишите программу, которая будет принимать на вход число из консоли
   и на выход будет выводить сообщение четное число или нет. Для определения четности числа
   используйте операцию получения остатка от деления (операция выглядит так: '% 2'). */

public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("Число четное!");
    } else {
      System.out.println("Число нечетное!");
    }
    scanner.close();
  }
}
