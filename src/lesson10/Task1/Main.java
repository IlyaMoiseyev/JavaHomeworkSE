package lesson10.Task1;
import lesson10.AuxiliaryClassForStringsEntry;

/* Задача№1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
   найденные строки и их длину. */

public class Main {
  public static void main(String[] args) {
    LongestAndShortestString.findAndShowLongestAndShortestString(AuxiliaryClassForStringsEntry
            .getArrayOfStrings(3));
    AuxiliaryClassForStringsEntry.closeScanner();
  }
}
