package lesson16.task3;

import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CurrencyConverter {
  public static void startConverter() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Пожалуйста введите введите сумму:\nФормат ввода: *сумма* BYN");
    convert(scanner.nextLine());
    scanner.close();
  }

  public static void convert(String valute) {
    if (!valute.matches("^\\d+\\sBYN")) {
      System.out.println("Введены некорректные даннные!");
      return;
    }

    Function<String, Double> converter = x -> {
      Pattern pattern = Pattern.compile("^\\d+");
      Matcher matcher = pattern.matcher(valute);
      int valuteBYN = 0;

      if (matcher.find()) {
        valuteBYN = Integer.parseInt(matcher.group());
      }
      return (double) Math.round((valuteBYN / 3.02) * 100) / 100;
    };

    System.out.println("Конвертированная сумма: " + converter.apply(valute) + " USD");
  }
}
