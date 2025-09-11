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
    boolean goOn = true;
    Scanner scanner = new Scanner(System.in);
    User userIldar = new User("Ильдар", 45, new Smartphone());
    User clonedUserIldar;

    System.out.println("Создан объект пользователя: " + userIldar);
    while (goOn) {
      System.out.println("Пожалуйста сделайте выбор:\n1 - Запуск програмы клонирования.\n2 - Завершить работу.");
      int decision = scanner.nextInt();
      if (decision == 1) {
        System.out.println("Зпущена программа клонирования объекта.\n" +
                "Пожалуста сделайте выбор уровня клонирования где:\n" +
                "1 - поверхностное клонирование.\n" +
                "2 - глубокое клонирование.");
        int secondDecision = scanner.nextInt();
        if (secondDecision == 1) {
          try {
            System.out.println("Выполняется поверхностное клонирование...");
            clonedUserIldar = userIldar.clone();
            System.out.println("Поверхностнрое клонирование завершено!\n" +
                    "Изначальный объект пользователя: " + userIldar +
                    "\nСклонированный объект пользователя: " + clonedUserIldar);

            userIldar.changeSmartphone("BelSel", "6", 1861);
            System.out.println("Изначальный объект пользователя сменил телефон! " + userIldar +
                    "\nСклонированный объект получил тот же телефон что и первый! " + clonedUserIldar +
                    "\nЭто связанно с тем что их внутреннее поле ссылается на один и тот же объект!");
          } catch (Exception e) {
            System.out.println("Все похерилось=0");
          }
          goOn = false;
        } else if (secondDecision == 2) {
          try {
            System.out.println("Выполняется глубокое клонирование...");
            userIldar.setShallowOrDeep(true);
            clonedUserIldar = userIldar.clone();
            System.out.println("Глубокое клонирование завершено!\n" +
                    "Изначальный объект пользователя: " + userIldar +
                    "\nСклонированный объект пользователя: " + clonedUserIldar +
                    "\nЗначение поля smartphone ссылается на разные объекты!");
            userIldar.setShallowOrDeep(false);
            userIldar.changeSmartphone("Apple", "17", 2025);
            System.out.println("Изначальный объект пользователя сменил телефон! " + userIldar +
                    "\nСклонированный объект пользователя остался с прежним телефоном: " + clonedUserIldar);
          } catch (Exception e) {
            System.out.println("Все похерилось=0");
          }
          goOn = false;
        }
      } else if (decision == 2) {
        goOn = false;
      }
    }
    scanner.close();
  }
}
