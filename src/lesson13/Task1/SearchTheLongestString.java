package lesson13.Task1;
import java.io.*;

public class SearchTheLongestString {

  public static String startSearchTheLongestString(File textFile) {
    StringBuilder stringBuilder;
    String longestString = null;
    if (textFile.exists()) {
      stringBuilder = new StringBuilder();
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile))) {
        int characterNumber;
        while ((characterNumber = bufferedReader.read()) != -1) {
          stringBuilder.append((char) characterNumber);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      longestString = getLongestString(stringBuilder);
      System.out.println("Самое длинное слово: " + longestString);
    }
    return longestString;
  }


  public static String getLongestString(StringBuilder inputString) {
    int maxLengthString = 0;
    int startPosition = -1;
    int maxLengthStringStartPosition = 0;

    for (int i = 0; i <= inputString.length(); i++) {
      char characterNumber = (i < inputString.length()) ? inputString.charAt(i) : ' ';
      if (Character.isLetterOrDigit(characterNumber)) {
        if (startPosition == -1) startPosition = i;
      } else {
        if (startPosition != -1) {
          int lengthString = i - startPosition;
          if (lengthString > maxLengthString) {
            maxLengthString = lengthString;
            maxLengthStringStartPosition = startPosition;
          }
          startPosition = -1;
        }
      }
    }
    return inputString.subSequence(maxLengthStringStartPosition,
            maxLengthStringStartPosition + maxLengthString).toString();
  }

  public static void writeTheLongestStringInFile(String longestString) {
    try (FileWriter fileWriter = new FileWriter("src\\lesson13\\Task1\\newFileWithLongestString.txt")) {
      fileWriter.write(longestString);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
