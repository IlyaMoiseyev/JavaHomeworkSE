package lesson8.additionalTask;

/* Задача №3*:
   Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable. */

public class Main {
  public static void main(String[] args) {
    Person personOne = new Person();
    Person personTwo;

    personOne.getInfoAboutPerson();
    personOne.readTheBook();

    try {
      System.out.println("Клонируем объект...");
      personTwo = personOne.clone();
      personTwo.setName("клонированный " + personTwo.getName());
      personTwo.getInfoAboutPerson();
      personTwo.readTheBook();
    } catch (CloneNotSupportedException ex) {
      System.out.println("Что-то пошло не так!");
    }
  }
}
