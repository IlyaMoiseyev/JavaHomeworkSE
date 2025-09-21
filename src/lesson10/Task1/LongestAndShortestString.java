package lesson10.Task1;

public abstract class LongestAndShortestString {

  public static void findAndShowLongestAndShortestString(String[] arrayOfStrings) {
    int positionOfTheSmallestString = 0;
    int positionOfTheBiggestString = 0;
    int minimumNumberOfCharacter = arrayOfStrings[0].length();
    int maximumNumberOfCharacters = 0;

    for (int i = 0; i < arrayOfStrings.length; i++) {
      if (arrayOfStrings[i].length() > maximumNumberOfCharacters) {
        maximumNumberOfCharacters = arrayOfStrings[i].length();
        positionOfTheBiggestString = i;
      }
      if (arrayOfStrings[i].length() < minimumNumberOfCharacter) {
        minimumNumberOfCharacter = arrayOfStrings[i].length();
        positionOfTheSmallestString = i;
      }
    }

    System.out.println("Самая большая строка: " + arrayOfStrings[positionOfTheBiggestString]
            + ", количество символов: " + maximumNumberOfCharacters);
    System.out.println("Самая маленькая строка: " + arrayOfStrings[positionOfTheSmallestString]
            + ", количество символов: " + minimumNumberOfCharacter);
  }
}
