package lesson17.additionalTasks.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/* Задача №1: Фильтрация и преобразование списка сотрудников.
   Дан список сотрудников List<Employee> employees.
   Нужно получить список имен сотрудников из отдела "Security", у которых зарплата выше 100_000.
   Ожидаемый результат: List<String> — имена подходящих сотрудников. */

public class Main {
  public static void main(String[] args) {
    List<Employee> employeeList = getPreparedListOfEmployees();
    List<Employee> sortedByParametersEmployeelist = employeeList.stream()
            .filter(e -> e.getDepartment().equals("Security") && e.getSalary() > 100000)
            .toList();

    System.out.println("Изначальный список сотрудников:");
    employeeList.forEach(System.out::println);

    System.out.println("\nСписок сотрудников подходящий по параметрам:");
    sortedByParametersEmployeelist.forEach(System.out::println);
  }

  public static List<Employee> getPreparedListOfEmployees() {
    int numberOfEmployees = new Random().nextInt(10, 16);
    return Stream.generate(Employee::new).limit(numberOfEmployees).toList();
  }
}
