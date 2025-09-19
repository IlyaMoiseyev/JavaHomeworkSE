package lesson9.shallowAndDeepCloning;
import java.util.Scanner;

/* Задача №2*:
   Создать программу для реализации поверхностного и глубокого клонирования объекта
   класса User. Пусть на вход программе будет передаваться тип операции клонирования
   (поверхностное клонирование или глубокое), а также id юзера для клонирования. */

public class Main {
  public static void main(String[] args) {
    startTheProgram();
  }

  public static void startTheProgram() {
    User[] users;
    Scanner scanner = new Scanner(System.in);
    int numberOfTheSelectedUser;
    User clonedUser;

    System.out.println("Пожалуйста сделайте выбор:\n1 - Запуск програмы клонирования.\n2 - Завершить работу.");
    int decision = scanner.nextInt();
    if (decision == 1) {
      System.out.println("Зпущена программа клонирования объекта.");
      users = getPreparedUsers();
      System.out.println("Создано " + users.length + " объекта пользователей!" +
              "\nДля кллонированя необходимо выбрать ID пользователя по порядоквому номеру из списка:");
      showUsersID(users);
      numberOfTheSelectedUser = scanner.nextInt();
      System.out.println("Для клонирования выбран объект пользователя: " + users[numberOfTheSelectedUser]);
      System.out.println("Пожалуста сделайте выбор уровня клонирования где:\n" +
              "1 - поверхностное клонирование.\n" +
              "2 - глубокое клонирование.");
      int secondDecision = scanner.nextInt();
      if (secondDecision == 1) {
        try {
          System.out.println("Выполняется поверхностное клонирование...");
          clonedUser = users[numberOfTheSelectedUser].clone();
          System.out.println("Поверхностнрое клонирование завершено!\n" +
                  "Изначальный объект пользователя: " + users[numberOfTheSelectedUser] +
                  "\nСклонированный объект пользователя: " + clonedUser);

          users[numberOfTheSelectedUser].changeSmartphone("BelSel", "6", 1861);
          System.out.println("Изначальный объект пользователя сменил телефон! " + users[numberOfTheSelectedUser] +
                  "\nСклонированный объект получил тот же телефон что и первый! " + clonedUser +
                  "\nЭто связанно с тем что их внутреннее поле ссылается на один и тот же объект!");
        } catch (Exception e) {
          System.out.println("Все похерилось=0");
        }
      } else if (secondDecision == 2) {
        try {
          System.out.println("Выполняется глубокое клонирование...");
          users[numberOfTheSelectedUser].setShallowOrDeep(true);
          clonedUser = users[numberOfTheSelectedUser].clone();
          System.out.println("Глубокое клонирование завершено!\n" +
                  "Изначальный объект пользователя: " + users[numberOfTheSelectedUser] +
                  "\nСклонированный объект пользователя: " + clonedUser +
                  "\nЗначение поля smartphone ссылается на разные объекты!");
          users[numberOfTheSelectedUser].setShallowOrDeep(false);
          users[numberOfTheSelectedUser].changeSmartphone("Apple", "17", 2025);
          System.out.println("Изначальный объект пользователя сменил телефон! " + users[numberOfTheSelectedUser] +
                  "\nСклонированный объект пользователя остался с прежним телефоном: " + clonedUser);
        } catch (Exception e) {
          System.out.println("Все похерилось=0");
        }
      }
    } else if (decision == 2) {
      System.out.println("Программа завершила свою работу.");
    }
    scanner.close();
  }

  public static void showUsersID(User[] users) {
    for (int i = 0; i < users.length; i++) {
      System.out.println("№" + i + " " + users[i].getId() + " " + users[i].getName());
    }
  }

  public static User[] getPreparedUsers() {
    User[] users = new User[3];
    users[0] = new User("Валентин", 41, new Smartphone("Siemens", "C35", 2000));
    users[1] = new User();
    users[2] = new User("Михаил", 25, new Smartphone("Motorola", "Roker E1", 2005));
    return users;
  }
}
