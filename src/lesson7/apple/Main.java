package lesson7.apple;
import java.lang.reflect.Field;

/*  Задача №2*:
    Создать класс Apple и добавить в него поле color с модификатором доступа private и
    инициализировать его. В методе main другого класса создать объект Apple, и не
    используя сеттеры изменить значение поля color. */

public class Main {
  public static void main(String[] args) {
    Apple apple = new Apple();
    System.out.println("Значение приватного, инициализированного поля colour: " + apple.getColour());

    try {
      Field field = Apple.class.getDeclaredField("colour");
      field.setAccessible(true);
      field.set(apple, "Yellow");
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Значение приватного, инициализированного поля colour после изменения: " + apple.getColour());
  }
}
