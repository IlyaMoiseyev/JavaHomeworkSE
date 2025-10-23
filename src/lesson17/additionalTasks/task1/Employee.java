package lesson17.additionalTasks.task1;

import java.util.Random;

public class Employee {
  private String name;
  private String department;
  private int salary;

  public Employee() {
    this(getRandomName(), getRandomDepartment(), getRandomSalary());
  }

  public Employee(String name, String department, int salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public static String getRandomName() {
    String[] defaultNames = {
            "Иван", "Валерий", "Дмитрий", "Инокентий",
            "Ибрагим", "Пантилимон", "Виктория", "Анна",
            "Константин", "Александр", "Михаил", "Сергей",
            "Екатерина", "Светлана", "Ульяна", "Ян", "Мария",
            "Инна", "Григорий", "Алёна", "Ярослав", "Лариса",
            "Степан", "Зинаида", "Антон", "Надежда", "Лариса",
            "Аркадий", "Эльвира", "Милана", "Борис", "София"
    };
    int index = new Random().nextInt(0, defaultNames.length);
    return defaultNames[index];
  }

  public static int getRandomSalary() {
    return new Random().nextInt(95000, 130000);
  }

  public static String getRandomDepartment() {
    String[] department = {"Accounting", "Security", "IT"};
    int index = new Random().nextInt(0, department.length);
    return department[index];
  }

  @Override
  public String toString() {
    return "Работник: " + name + ", отдел: " + department + ", зарплата - " + salary;
  }
}
