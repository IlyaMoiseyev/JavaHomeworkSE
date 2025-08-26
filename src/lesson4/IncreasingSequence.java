package lesson4;

/* Задача №6. Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего). */

public class IncreasingSequence {
  public static void main(String[] args) {
    int[] array = ArrayForAllClasses.getArray();
    boolean isIncreasingSequenceOrNo = true;

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        isIncreasingSequenceOrNo = false;
        break;
      }
    }

    if (isIncreasingSequenceOrNo) {
      System.out.println("Последовательность возрастающая!");
    } else {
      System.out.println("Последовательность не является возрастающей!");
    }
  }
}
