package lesson8.animalsChapter9;

/* Задача 1:
   Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
   Переопределить методы voice(), eat(String food) чтобы они выводили верную
   информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
   Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
   туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
   или другую строку то он будет недоволен. */

public class Main {
  public static void main(String[] args) {
    Animal rabbit = new Rabbit();
    Animal tiger = new Tiger();
    Animal dog = new Dog();

    rabbit.getInfoAboutAnimal();
    rabbit.eat("трава");
    rabbit.voice();

    tiger.getInfoAboutAnimal();
    tiger.eat("батон");
    tiger.voice();

    dog.getInfoAboutAnimal();
    dog.eat("кости");
    dog.voice();
  }
}
