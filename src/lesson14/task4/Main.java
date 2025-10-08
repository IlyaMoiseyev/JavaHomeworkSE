package lesson14.task4;

/* Задача №4.*:
   Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
   работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
   основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
   классов(т.е. это generic).
   Предусмотреть операции(методы):
   1. добавления элемента
   2. удаления элемента
   3. получение элемента по индексу
   4. проверка есть ли элемент в коллекции
   5. очистка всей коллекции
   Предусмотреть конструктор без параметров - создает массив размером
   по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
   массива. Предусмотреть возможность автоматического расширения коллекции при
  добавлении элемента в том случае, когда коллекция уже заполнена. */

public class Main {
  public static void main(String[] args) {
    MyCollection<Integer> myCollection = new MyCollection<>();
    myCollection.addElement(1);
    myCollection.addElement(2);
    myCollection.addElement(3);
    myCollection.addElement(4);
    myCollection.addElement(5);
    myCollection.addElement(6);
    myCollection.printCollection();

    myCollection.removeElement(4);
    myCollection.removeElement(5);
    myCollection.printCollection();

    System.out.println("Найден ли элемент: " + myCollection.contains(3));

    myCollection.removeAll();
    myCollection.printCollection();
  }
}
