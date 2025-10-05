package lesson15.additionalTasks.task1;

import java.util.HashMap;
import java.util.Map;

public abstract class PhoneBook {
  public static void startReversePhoneBookProgram() {
    revetKeyAndValueInMap(getPreparedPhoneBook());
  }

  public static void revetKeyAndValueInMap(HashMap<String, Integer> phoneBook) {
    HashMap<Integer, String> revertPhoneBook = new HashMap<>();

    for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
      revertPhoneBook.put(entry.getValue(), entry.getKey());
    }

    System.out.println("Изначальная телефонная книга:");
    printPhoneBook(phoneBook);
    System.out.println("Перевернутая телефонная книга:");
    printPhoneBook(revertPhoneBook);
  }

  public static HashMap<String, Integer> getPreparedPhoneBook() {
    HashMap<String, Integer> phoneBook = new HashMap<>();
    phoneBook.put("Иван", 2333857);
    phoneBook.put("Василий", 2338593);
    phoneBook.put("Игорь", 2535114);
    phoneBook.put("Аркадий", 2256678);

    return phoneBook;
  }

  public static <T, U> void printPhoneBook(HashMap<T, U> phoneBook) {
    for (Map.Entry<T, U> entry : phoneBook.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    System.out.println("------------------------");
  }
}
