package lesson13.Task2;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentValidation {

  public static void startValidation() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Пожалуйста введите путь к документу для последующей валидации:");
    validateDocument(scanner.nextLine());
    scanner.close();
  }

  public static void validateDocument(String pathToDocument) {
    File file = new File(pathToDocument);
    Matcher matcher;
    Pattern pattern = Pattern.compile(
            "(^docnum\\d{9}$)" +
                    "|(^contract(\\w|\\d){7}$)" +
                    "|(^docnum\\d{10,}$)" +
                    "|(^docnum(\\d|\\w){9,}$)" +
                    "|(^contract(\\w|\\d){8,}$)" +
                    "|(^contract(\\S){7,}$)");

    if (file.exists()) {
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

        while (bufferedReader.ready()) {
          matcher = pattern.matcher(bufferedReader.readLine());
          if (matcher.find()) {
            if (matcher.group(1) != null) {
              writeIsValidDocument(matcher.group(1));
            } else if (matcher.group(2) != null) {
              writeIsValidDocument(matcher.group(2));
            } else if (matcher.group(4) != null) {
              writeIsNoValidDocument(matcher.group(4), "превышен лимит символов.");
            } else if (matcher.group(5) != null) {
              writeIsNoValidDocument(matcher.group(5), "в номере документа содержаться недопустимые символы.");
            } else if (matcher.group(7) != null) {
              writeIsNoValidDocument(matcher.group(7), "превышен лимит символов.");
            } else if (matcher.group(9) != null) {
              writeIsNoValidDocument(matcher.group(9), "в номере документа содержаться недопустимые символы.");
            }
          }
        }
        System.out.println("Валидация документа прошла успешно! Проверьте файлы с информацией.");
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Файл по данному пути не обнаружен!");
    }
  }

  public static void writeIsValidDocument(String validDocument) {
    try (FileWriter writer = new FileWriter("src\\lesson13\\Task2\\ValidDocuments.txt", true)) {
      writer.write(validDocument + "\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void writeIsNoValidDocument(String noValidDocument, String reason) {
    try (FileWriter writer = new FileWriter("src\\lesson13\\Task2\\NoValidDocuments.txt", true)) {
      writer.write(noValidDocument + ", причина: " + reason + "\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
