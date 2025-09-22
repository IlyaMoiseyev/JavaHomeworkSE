package lesson11.Task1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SearchAbbreviations {

  public static void searchAbbreviationsInString() {
    String inputString;
    boolean isDetected = false;
    Scanner scanner = new Scanner(System.in);
    Pattern pattern = Pattern.compile("\\b([A-Z,А-Я]{2,6})(\\s[A-Z,А-Я]{2,6})+\\b|\\b([A-Z,А-Я]{2,6})\\b");
    Matcher matcher;

    System.out.println("Пожалуйста введите текст для поиска аббревиатур:");
    inputString = scanner.nextLine();
    matcher = pattern.matcher(inputString);

    System.out.println("Идет поиск аббревиатур....");
    while (matcher.find()) {
      System.out.println(matcher.group() + " ");
      isDetected = true;
    }

    if (!isDetected) System.out.println("Аббревиатуры не обнаружены =(");
    scanner.close();
  }
}
