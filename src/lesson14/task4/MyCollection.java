package lesson14.task4;

public class MyCollection<T> {
  private T[] myArray;
  private int count;

  public MyCollection() {
    this(5);
  }

  public MyCollection(int size) {
    myArray = (T[]) new Object[size];
  }

  public void addElement(T element) {
    if (count >= myArray.length) {
      T[] tempArray = myArray;
      myArray = (T[]) new Object[tempArray.length + 5];
      for (int i = 0; i < tempArray.length; i++) {
        myArray[i] = tempArray[i];
      }
    }
    myArray[count] = element;
    count++;
  }

  public void removeElement(T element) {
    boolean isContains = false;

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] != null && myArray[i].equals(element)) {
        isContains = true;
        for (; i < myArray.length - 1; i++) {
          myArray[i] = myArray[i + 1];
        }
      }
    }
    if (isContains) {
      System.out.println("Элемент успешно удален из коллекции!");
    } else {
      System.out.println("Такого элемента в коллекции нет!");
    }
  }

  public void removeAll(){
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = null;
    }
    System.out.println("Все элементы коллекции удалены!");
  }

  public T getElement(int index) {
    if (index < count) {
      return myArray[index];
    }
    System.out.println("Элемента по данному индексу НЕТ!");
    return null;
  }

  public int indexOf(T element) {
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] != null && myArray[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(T element) {
    for (T tempElement : myArray) {
      if (tempElement != null && tempElement.equals(element)) {
        return true;
      }
    }
    return false;
  }

  public void printCollection() {
    int tempCount = 0;
    System.out.print("Коллекция: ");
    for (T e : myArray) {
      if (e == null) break;
      System.out.print(e + " ");
      tempCount++;
    }
    if (tempCount==0) System.out.print(" элементы отсутствуют!");
    System.out.println();
  }
}
