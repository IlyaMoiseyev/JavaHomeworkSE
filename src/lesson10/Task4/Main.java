package lesson10.Task4;
import lesson10.AuxiliaryClassForStringsEntry;

/* Задача№4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
   Если таких слов несколько, найти первое из них. */

public class Main {
  public static void main(String[] args) {
    StringOfVariousCharacters
            .findStringOfVariousCharacters(AuxiliaryClassForStringsEntry.getArrayOfStrings(3));
    AuxiliaryClassForStringsEntry.closeScanner();
  }
}
