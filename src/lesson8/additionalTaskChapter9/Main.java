package lesson8.additionalTaskChapter9;
import java.lang.reflect.Constructor;

/* Задача №2*:
   Написать такой конструктор, который запретит создание объекта класса Dog в других
   классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
   обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
   способа. */

public class Main {
  public static void main(String[] args) {
    // Способ №1. Сделать методы статическими.
    Dog.voice();
    Dog.eat("черемуха");

    // Способ №2. Через рефлексию.
    try {
      Class<?> clazz = Class.forName("lesson8.additionalTaskChapter9.Dog");
      Constructor<?> constructor = clazz.getDeclaredConstructor();
      constructor.setAccessible(true);
      Object tempDog = constructor.newInstance();
      Dog dog = (Dog) tempDog;
      dog.eatForObject("Кости");
      dog.voiceForObject();
    } catch (Exception ex) {
      System.out.println("Все похерилось =(");
    }
  }
}
