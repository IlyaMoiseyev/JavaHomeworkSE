package lesson10.Task5;
import lesson10.AuxiliaryClassForStringsEntry;

/* Задача№5. Вывести на консоль новую строку, которой задублирована каждая буква из
   начальной строки. Например, "Hello"-> "HHeelllloo". */

public class Main {
  public static void main(String[] args) {
    DuplicateCharactersOfString.duplicateCharactersInString(AuxiliaryClassForStringsEntry.getString());
    AuxiliaryClassForStringsEntry.closeScanner();
  }
}
