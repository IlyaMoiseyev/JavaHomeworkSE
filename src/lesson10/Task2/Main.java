package lesson10.Task2;
import lesson10.AuxiliaryClassForStringsEntry;

/* Задача№2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
   значений их длины. */

public class Main {
  public static void main(String[] args) {
    StringOrdering.orderingAndShowArrayOfStrings(AuxiliaryClassForStringsEntry.getArrayOfStrings(3));
    AuxiliaryClassForStringsEntry.closeScanner();
  }
}
