package lesson8.employees;

public class Director extends Employee {
  public Director() {
    this("Генадий Александрович", 98, "директор", 3);
  }

  public Director(String name, int age, String post, int experience) {
    super(name, age, post, experience);
  }
}
