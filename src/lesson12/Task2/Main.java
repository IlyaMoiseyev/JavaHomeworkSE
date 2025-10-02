package lesson12.Task2;

/* Задача №2*. Написать try/catch/finally, в котором finally вызван не будет. */

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println("Выполняется ооооочень важный блок кода...");
      System.out.println("Сейчас все похерится так люто, что блок finally не отработает=)");
      System.exit(0);
    } catch (Exception e) {
      System.out.println("Оп..ошибочка:" + e.getMessage());
    } finally {
      System.out.println("Выполнение блока finally...");
    }
  }
}
