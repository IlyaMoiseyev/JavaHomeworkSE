package lesson4;
import java.util.Arrays;
import java.util.Scanner;

// Вспомогательный класс для всех заданий по 4му занятию.

public class ArrayForAllClasses {
  public static int[] getArray() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите размер массива:");
    int sizeOfArray = scanner.nextInt();
    int[] arrayOfNumbers = new int[sizeOfArray];

    for (int i = 0; i < arrayOfNumbers.length; i++) {
      arrayOfNumbers[i] = (int) (Math.random() * 51);
    }

    System.out.println("Массив заполнен рандомными чмслами:  " + Arrays.toString(arrayOfNumbers));
    scanner.close();
    return arrayOfNumbers;
  }
}
