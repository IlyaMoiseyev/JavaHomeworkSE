package lesson8.employees;

public class Worker extends Employee {

  public Worker() {
    this("Иван Дулин", 40, "рабочий", 15);
  }

  public Worker(String name, int age, String post, int experience) {
    super(name, age, post, experience);
  }
}
