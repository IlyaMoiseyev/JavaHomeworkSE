package lesson10.Task5;

public abstract class DuplicateCharactersOfString {

  public static void duplicateCharactersInString(String inputString) {
    StringBuilder stringBuilder = new StringBuilder();
    char[] arrayOfCharacters = inputString.toCharArray();

    for (int i = 0; i < inputString.length(); i++) {
      stringBuilder.append(arrayOfCharacters[i]).append(arrayOfCharacters[i]);
    }
    System.out.println("Строка с дублированными символами: " + stringBuilder);
  }
}
