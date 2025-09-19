package lesson8.employees;

public class Accountant extends Employee {

  public Accountant() {
    this("Вера Степановна", 65, "бухгалтер", 35);
  }

  public Accountant(String name, int age, String post, int experience) {
    super(name, age, post, experience);
  }
}
