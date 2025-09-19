package lesson8.employees;

/* Задача 1:
   Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
   который печатает название должности и имплементировать этот метод в созданные
   классы. */

public class Main {
  public static void main(String[] args) {
    Employee director = new Director();
    Employee worker = new Worker("Светозар Николаевич", 45, "рабочий", 6);
    Employee accountant = new Accountant();

    director.showInfoAboutEmployee();
    director.printPost();

    worker.showInfoAboutEmployee();
    worker.printPost();

    accountant.showInfoAboutEmployee();
    accountant.printPost();
  }
}
