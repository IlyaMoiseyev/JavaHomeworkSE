package lesson10.Task4;
import java.util.Arrays;
import java.util.Scanner;

public abstract class StringOfVariousCharacters {
  private static int[] indexesOfStringsWithOrWithoutDifferentCharacters;
  private static int countOfStringsWithDifferentCharacters;
  private static String[] tempArray;

  public static void findStringOfVariousCharacters(String[] arrayOfStrings) {
    tempArray = arrayOfStrings;
    indexesOfStringsWithOrWithoutDifferentCharacters = getArrayWithDefaultNegativeIndexes(arrayOfStrings.length);

    for (int i = 0; i < arrayOfStrings.length; i++) {
      if (checkString(arrayOfStrings[i])) {
        indexesOfStringsWithOrWithoutDifferentCharacters[i] = 1;
        countOfStringsWithDifferentCharacters++;
      }
    }

    if (countOfStringsWithDifferentCharacters > 0) {
      System.out.println("Найдено " + countOfStringsWithDifferentCharacters + " строк со всеми различными символами!");
      if (countOfStringsWithDifferentCharacters == 1) {
        showFirstDifferentString();
      } else if (countOfStringsWithDifferentCharacters > 1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Пожалуйста сделайте выбор:
                1 - Отобразить первую найденную строку со всеми различными символами.
                2 - Отобразить все найденные строки со всеми различными символами.
                """);
        int choice = scanner.nextInt();

        if (choice == 1) {
          showFirstDifferentString();
          scanner.close();
        } else if (choice == 2) {
          showAllDifferentStrings();
          scanner.close();
        }
      }
    } else {
      System.out.println("Строк со всеми различными символами нет!");
    }
  }

  private static int[] getArrayWithDefaultNegativeIndexes(int length) {
    int[] arrayWithDefaultNegativeIndexes = new int[length];
    Arrays.fill(arrayWithDefaultNegativeIndexes, -1);
    return arrayWithDefaultNegativeIndexes;
  }

  public static boolean checkString(String string) {
    char[] arrayOfCharacters = string.toCharArray();

    for (int i = 0; i < arrayOfCharacters.length - 1; i++) {
      char tempChar = arrayOfCharacters[i];
      for (int j = i; j < arrayOfCharacters.length - 1; j++) {
        if (tempChar == arrayOfCharacters[j + 1]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void showFirstDifferentString() {
    for (int i = 0; i < indexesOfStringsWithOrWithoutDifferentCharacters.length; i++) {
      if (indexesOfStringsWithOrWithoutDifferentCharacters[i] > 0) {
        System.out.println("Первая строка со всеми различными символами: " + tempArray[i]);
        break;
      }
    }
  }

  public static void showAllDifferentStrings() {
    int count = 1;
    for (int i = 0; i < indexesOfStringsWithOrWithoutDifferentCharacters.length; i++) {
      if (indexesOfStringsWithOrWithoutDifferentCharacters[i] > 0) {
        System.out.println("Строка №" + count + " со всеми различными символами: " + tempArray[i]);
      }
    }
  }
}
