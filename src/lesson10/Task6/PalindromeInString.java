package lesson10.Task6;
import java.util.Scanner;

public abstract class PalindromeInString {

  public static void findPalindromeInString(String inpitString) {
    System.out.println("Введенная строка: " + inpitString);
    String[] arrayOfStrings = inpitString.split(" ");
    int lengthOfArray = arrayOfStrings.length - 1;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Пожалуйста введите номер любого слова в строке для проверки на палиндром!\nгде:\n"
            + "0 - порядковый номер первого слова.\n...\n"
            + lengthOfArray + " - порядковый номер последнего слова.");

    int choice = scanner.nextInt();

    if (choice <= (lengthOfArray) && choice >= 0) {
      System.out.println("Слово выбранное для проверки: " + arrayOfStrings[choice] + "\nидет проверка....");
      if (isPalindrome(arrayOfStrings[choice])) {
        System.out.println("Выбранное слово ЯВЛЯЕТСЯ палиндромом!!!");
      } else {
        System.out.println("Выбранное слово НЕ ЯВЛЯЕТСЯ палиндромом!!!");
      }
    } else {
      System.out.println("Введены некорректные данные, перезапустите программу!");
    }
    scanner.close();
  }

  public static boolean isPalindrome(String checkedString) {
    StringBuilder tempString = new StringBuilder(checkedString);
    tempString.reverse();
    return tempString.toString().equals(checkedString);
  }
}
