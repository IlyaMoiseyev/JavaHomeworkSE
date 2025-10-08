package lesson16.task1;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class WhenHundredYearsOld {
  public static void startCalculateDate() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Пожалуста введите дату своего рождения:\nформат ввода: yyyy-mm-dd");
    String date = sc.nextLine();
    showDate(calculateDate(date));
    sc.close();
  }

  public static LocalDate calculateDate(String date) {
    LocalDate localDate = LocalDate.parse(date);
    return localDate.plusYears(100);
  }

  public static void showDate(LocalDate date) {
    System.out.println("Сто лет Вам исполнится: " + date);
  }
}
