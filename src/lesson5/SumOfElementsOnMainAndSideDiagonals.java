package lesson5;
import java.util.Random;

/* Дополнительная задача с урока:
   Найдите сумму элементов на главной и побочной диагонали. */

public class SumOfElementsOnMainAndSideDiagonals {
  public static void main(String[] args) {
    int[][] array = new int[5][5];
    int sumOfElementsInMainDiagonal = 0;
    int sumOfElementsInSideDiagonal = 0;
    int counterOfSideDiagonal = 0;
    Random random = new Random();

    System.out.println("Массив заполненный рандомными значениями:");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = random.nextInt(1, 10);
        System.out.print(array[i][j] + " ");
        if (i == j) {
          sumOfElementsInMainDiagonal += array[i][j];
        }
      }
      System.out.println();
    }
    System.out.println("Сумма элементов основной диагонали: " + sumOfElementsInMainDiagonal);

    for (int i = array.length - 1; i >= 0; i--) {
      sumOfElementsInSideDiagonal += array[i][counterOfSideDiagonal];
      counterOfSideDiagonal++;
    }
    System.out.println("Сумма элементов побочной диагонали: " + sumOfElementsInSideDiagonal);
  }
}
