package lesson14.task2;

import java.util.LinkedList;

public class AnimalCollection {
  private final LinkedList<Animal> collectionOfAnimas;

  public AnimalCollection() {
    collectionOfAnimas = new LinkedList<>();
  }

  public void addAnimal(Animal animal) {
    collectionOfAnimas.addFirst(animal);
    System.out.println("В начало коллекции добавлено животное: " + animal.getType());
  }

  public void removeAnimal() {
    if (!collectionOfAnimas.isEmpty()) {
      System.out.println("Удаление животного из конца коллекции: " + collectionOfAnimas.getLast().getType());
      collectionOfAnimas.removeLast();
    } else {
      System.out.println("Удаление животного невозможно, коллекция пуста!");
    }
  }

  public void showAnimalCollection() {
    if (!collectionOfAnimas.isEmpty()) {
      System.out.println("Коллекция животных:");
      int count = 1;
      for (Animal animal : collectionOfAnimas) {
        System.out.println(count + " - " + animal.getType() + ";");
        count++;
      }
    } else {
      System.out.println("Коллекция животных пуста!");
    }
  }
}
