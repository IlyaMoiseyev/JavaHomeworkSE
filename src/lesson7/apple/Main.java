package lesson7.apple;

/*  Задача №2*:
    Создать класс Apple и добавить в него поле color с модификатором доступа private и
    инициализировать его. В методе main другого класса создать объект Apple, и не
    используя сеттеры изменить значение поля color. */

public class Main {
  public static void main(String[] args) {
    Apple firstApple = new Apple();
    System.out.println("Значение приватного, инициализированного поля colour: " + firstApple.getColour());

    Apple secondApple = new Apple("Green");
    System.out.println("Значение приватного, измененного поля colour: " + secondApple.getColour());
  }
}
