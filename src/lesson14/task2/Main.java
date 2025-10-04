package lesson14.task2;

/* Задача №2:
   Создать класс, который будет хранить в себе коллекцию с названиями животных.
   Реализовать методы удаления и добавления животных по следующим правилам:
   добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
   объекта этого класса в main методе другого класса. */

public class Main {
  public static void main(String[] args) {
    AnimalCollection collectionOfAnimals = new AnimalCollection();

    collectionOfAnimals.addAnimal(new Animal());
    collectionOfAnimals.addAnimal(new Animal());
    collectionOfAnimals.addAnimal(new Animal());
    collectionOfAnimals.addAnimal(new Animal());

    collectionOfAnimals.showAnimalCollection();

    collectionOfAnimals.removeAnimal();
    collectionOfAnimals.removeAnimal();

    collectionOfAnimals.showAnimalCollection();
  }
}
