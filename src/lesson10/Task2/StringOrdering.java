package lesson10.Task2;

public abstract class StringOrdering {

  public static void orderingAndShowArrayOfStrings(String[] arrayOfStrings) {

    for (int i = 0; i < arrayOfStrings.length - 1; i++) {
      for (int j = 0; j < arrayOfStrings.length - 1 - i; j++) {
        String tempString = arrayOfStrings[j];
        if (arrayOfStrings[j + 1].length() < tempString.length()) {
          arrayOfStrings[j] = arrayOfStrings[j + 1];
          arrayOfStrings[j + 1] = tempString;
        }
      }
    }

    System.out.println("Отсортированный массив строк в порядке возрастания:");
    for (String str : arrayOfStrings) {
      System.out.println(str);
    }
  }
}
