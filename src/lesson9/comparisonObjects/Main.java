package lesson9.comparisonObjects;

/* Задача 1:
   Создать класс для описания пользователя системы. Переопределить в классе методы
   toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
   значением полей и сравнить с помощью метода equals. */

public class Main {
  public static void main(String[] args) {
    User dima = new User("Дмитрий", 25);
    User someDima = new User("Дмитрий", 25);
    User elsa = new User("Эльза", 39);

    System.out.println("Равны ли объекты: " + dima.equals(someDima));
    System.out.println("Равны ли объекты: " + dima.equals(elsa));
  }
}
