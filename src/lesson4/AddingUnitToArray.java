package lesson4;
import java.util.Arrays;
import java.util.Scanner;

/* Зачача №7*. Имеется массив из неотрицательных чисел(любой). Представьте что массив
   представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
   добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
   содержит нуля в начале, кроме самого числа 0. */

public class AddingUnitToArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите размер массива:");
    int sizeOfArray = scanner.nextInt();
    int[] array = new int[sizeOfArray];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 9 + 1);
    }
    System.out.println("Массив заполнен рандомными чмслами:  " + Arrays.toString(array));

    for (int i = array.length - 1; i >= 0; i--) {
      if (array[i] < 9) {
        array[i]++;
        break;
      } else if (array[i] == 9) {
        array[i] = 0;
      }
    }
    if (array[0] == 0) {
      array = new int[array.length + 1];
      array[0] = 1;
    }
    System.out.println("Массив с добавленной единицей: " + Arrays.toString(array));
    scanner.close();
  }
}
