package lesson10;
import java.util.Scanner;

public abstract class AuxiliaryClassForStringsEntry {
  private static Scanner scanner;

  public static String getString() {
    System.out.println("Пожалуйста введите строку:");
    scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public static String[] getArrayOfStrings(int numberOfStrings) {
    String[] arrayOfEntriesStrings = new String[numberOfStrings];
    scanner = new Scanner(System.in);
    System.out.println("Создан массив для хранения " + numberOfStrings + " строк.");

    for (int i = 0; i < arrayOfEntriesStrings.length; i++) {
      System.out.println("Пожалуйста введите строку №" + (i + 1));
      arrayOfEntriesStrings[i] = scanner.nextLine();
    }
    return arrayOfEntriesStrings;
  }

  public static void closeScanner() {
    scanner.close();
  }
}
