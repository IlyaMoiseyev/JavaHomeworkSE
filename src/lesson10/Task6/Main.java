package lesson10.Task6;
import lesson10.AuxiliaryClassForStringsEntry;

/* Задача№6*:
   Дана строка произвольной длины с произвольными словами. Написать программу для
   проверки является ли любое выбранное слово в строке палиндромом.
   Например, есть строка, вводится число 3, значит необходимо проверить является ли
   3-е слово в этой строке палиндромом.
   Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
   например, в строке 5 слов, а на вход программе передали число 500. */

public class Main {
  public static void main(String[] args) {
    PalindromeInString.findPalindromeInString(AuxiliaryClassForStringsEntry.getString());
    AuxiliaryClassForStringsEntry.closeScanner();
  }
}
