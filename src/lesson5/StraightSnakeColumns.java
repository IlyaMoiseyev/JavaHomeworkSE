package lesson5;
import java.util.Scanner;

/* Задача №3*:
   Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
   Формат входных данных:
   Программа получает на вход два числа n и m.
   Формат выходных данных:
   Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
   символа. */

public class StraightSnakeColumns {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите количество строк:");
    int numberOfRows = scanner.nextInt();
    System.out.println("Введите количество столбцов:");
    int numberOfColumns = scanner.nextInt();

    String[][] array = new String[numberOfRows][numberOfColumns];
    int counter = 0;
    boolean flag = true;

    for (int i = 0; i < array.length; i++) {
      if (flag) {
        for (int j = 0; j < array[i].length; j++) {
          if (counter < 10) {
            array[i][j] = "  " + counter;
          } else if (counter <= 99) {
            array[i][j] = " " + counter;
          } else {
            array[i][j] = "" + counter;
          }
          counter++;
        }
        flag = false;
      } else {
        for (int j = array[i].length - 1; j >= 0; j--) {
          if (counter < 10) {
            array[i][j] = "  " + counter;
          } else if (counter <= 99) {
            array[i][j] = " " + counter;
          } else {
            array[i][j] = "" + counter;
          }
          counter++;
        }
        flag = true;
      }
    }

    System.out.println("Массив: ");
    for (String[] tempArray : array) {
      for (String element : tempArray) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
