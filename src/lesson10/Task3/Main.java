package lesson10.Task3;
import lesson10.AuxiliaryClassForStringsEntry;

/* Задача№3. Ввести 3 строки с консоли. Вывести на консоль те строки,
   длина которых меньше средней, а также их длину. */

public class Main {
  public static void main(String[] args) {
    StringsLessThenAverageLength
            .findAndShowStringsLessThenAverageLength(AuxiliaryClassForStringsEntry.getArrayOfStrings(3));
    AuxiliaryClassForStringsEntry.closeScanner();
  }
}
