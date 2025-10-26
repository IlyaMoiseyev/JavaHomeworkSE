package lesson19.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumAndMinimumNumberService {
  public static void startSearchProgram() {
    int[] arrayWithNumbers = getArrayWithNumbers();
    MaximumValueSearcher maximumValueSearcher = new MaximumValueSearcher(arrayWithNumbers);
    MinimumValueSearcher minimumValueSearcher = new MinimumValueSearcher(arrayWithNumbers);
    System.out.println("Изначальный массив элементов: " + Arrays.toString(arrayWithNumbers));

    new Thread(maximumValueSearcher).start();
    new Thread(minimumValueSearcher).start();

    try {
      Thread.sleep(300);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Максимальное значение элемента массива: " + maximumValueSearcher.getMaximumValueInArray());
    System.out.println("Минимальное значение элемента массива: " + minimumValueSearcher.getMinimumValueInArray());
  }

  public static int[] getArrayWithNumbers() {
    Scanner sc = new Scanner(System.in);
    List<Integer> listOfNumbers = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\d+");
    System.out.println("Пожалуйста ведите строку содержащую числа:");
    Matcher matcher = pattern.matcher(sc.nextLine());

    while (matcher.find()) {
      listOfNumbers.add(Integer.parseInt(matcher.group()));
    }

    sc.close();
    return listOfNumbers.stream().mapToInt(x -> x).toArray();
  }
}
