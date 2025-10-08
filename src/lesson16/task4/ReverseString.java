package lesson16.task4;

import java.util.Scanner;
import java.util.function.Supplier;

public abstract class ReverseString {
  public static void reverseString() {
    Supplier<String> supplier = () -> {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Пожалуйста введите любое слово:");
      StringBuilder builder = new StringBuilder(scanner.nextLine());
      builder.reverse();
      scanner.close();
      return builder.toString();
    };

    System.out.println("Перевернутая строка: " + supplier.get());
  }
}
