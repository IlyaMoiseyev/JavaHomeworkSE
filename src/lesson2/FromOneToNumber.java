package lesson2;
import java.util.Scanner;

/* Напишите программу, где пользователь вводит любое целое положительное число. А
   программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
   числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
   ввести некорректные данные. */

public class FromOneToNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int summingNumber = 0;
    System.out.println("Введите любое целое, положительное число: ");
    if (scanner.hasNextInt()) {
      int enteredNumber = scanner.nextInt();
      if (enteredNumber >= 1) {
        for (int i = 1; i <= enteredNumber; i++) {
          summingNumber += i;
        }
        System.out.print("Сумма чисел от 1 до " + enteredNumber + " равна: " + summingNumber);
      } else {
        System.out.println("Введенное число не соответствует условию задания!");
      }
    } else {
      System.out.println("Введены некорректные данные!");
    }
    scanner.close();
  }
}
