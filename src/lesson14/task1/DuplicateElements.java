package lesson14.task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateElements {
  public static void startRemoveDuplicatesProgram() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Пожалуйста введите набор произвольных чисел:");
    removeDuplicateElements(scanner.nextLine());
    scanner.close();
  }

  public static void removeDuplicateElements(String inputString) {
    ArrayList<Integer> listWithNumbers = prepareCollectionWithElements(inputString);
    ArrayList<Integer> listWithoutDuplicateNumbers = new ArrayList<>();

    for (int number : listWithNumbers) {
      if (!listWithoutDuplicateNumbers.contains(number)) listWithoutDuplicateNumbers.add(number);
    }

    System.out.print("Изначальная коллекция элементов: ");
    printCollection(listWithNumbers);
    System.out.print("Коллекция без дублированных элементов: ");
    printCollection(listWithoutDuplicateNumbers);
  }

  public static ArrayList<Integer> prepareCollectionWithElements(String stringWithElements) {
    ArrayList<Integer> listWithNumbers = null;

    if (stringWithElements != null) {
      listWithNumbers = new ArrayList<>();
      Pattern pattern = Pattern.compile("\\d+");
      Matcher matcher = pattern.matcher(stringWithElements);
      while (matcher.find()) {
        listWithNumbers.add(Integer.parseInt(matcher.group()));
      }
    }
    return listWithNumbers;
  }

  public static void printCollection(ArrayList<Integer> collectionOfElements) {
    if (collectionOfElements != null) {
      for (int element : collectionOfElements) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
