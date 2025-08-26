package lesson4;
import java.util.Arrays;

/* Задача №5. Пройти по массиву и поменять местами элементы первый и последний, второй и
   предпоследний и т.д. */

public class SwapElements {
  public static void main(String[] args) {
    int[] array = ArrayForAllClasses.getArray();
    for (int i = 0; i < array.length / 2; i++) {
      int tempNum = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = tempNum;
    }
    System.out.println(Arrays.toString(array));
  }
}
