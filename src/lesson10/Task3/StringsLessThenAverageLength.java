package lesson10.Task3;

public abstract class StringsLessThenAverageLength {

  public static void findAndShowStringsLessThenAverageLength(String[] arrayOfStrings) {
    int numberOfStrings = arrayOfStrings.length;
    double sumOfTheLengthOfAllStrings = 0;
    int averageLengthOfString;

    for (String str : arrayOfStrings) {
      sumOfTheLengthOfAllStrings += str.length();
    }

    averageLengthOfString = (int) Math.round(sumOfTheLengthOfAllStrings / numberOfStrings);
    System.out.println("Средняя длина строки состоит из: " + averageLengthOfString + " символов.");

    for (String str : arrayOfStrings) {
      if (str.length() < averageLengthOfString) {
        System.out.println("Длинна строки \"" + str + "\" меньше средней, состоит из " + str.length() + " символов.");
      }
    }
  }
}
