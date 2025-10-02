package lesson11.Task2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class TextAnalysis {

  public static void startTextAnalysis(String text) {
    boolean emailIsDetected = false;
    boolean phoneNumberIsDetected = false;
    boolean documentNumberIsDetected = false;
    Pattern emailPattern = Pattern.compile("\\b\\w+@\\w{2,}\\.\\w{2,3}\\b");
    Pattern phoneNumberPattern = Pattern.compile("(\\+)?(\\d{3})?\\(\\d{2}\\)\\d{2}-?\\d{2}-?\\d{3}\\b");
    Pattern documentNumberPattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}\\b");
    Matcher matcher;

    matcher = emailPattern.matcher(text);
    System.out.println("Поиск адресов электронной почты в документе...");
    while (matcher.find()) {
      System.out.println("email: " + matcher.group());
      emailIsDetected = true;
    }
    if (!emailIsDetected) System.out.println("В документе отсутствуют адреса электронной почты.");

    matcher = phoneNumberPattern.matcher(text);
    System.out.println("Поиск телефонных номеров в документе...");
    while (matcher.find()) {
      System.out.println("phone: " + matcher.group());
      phoneNumberIsDetected = true;
    }
    if (!phoneNumberIsDetected) System.out.println("В документе отсутствуют телефонные номера.");

    matcher = documentNumberPattern.matcher(text);
    System.out.println("Поиск номера документа в тексте...");
    while (matcher.find()) {
      System.out.println("document number: " + matcher.group());
      documentNumberIsDetected = true;
    }
    if (!documentNumberIsDetected) System.out.println("В тексте отсутствует номер документа.");
  }
}
