package lesson8.animalsChapter9;

public class Dog extends Animal {

  public Dog() {
    this("Пес", 10);
  }

  public Dog(String type, int age) {
    super(type, age);
  }

  @Override
  public void eat(String food) {
    if (food.equalsIgnoreCase("кости")) {
      System.out.println("мммммм косточки, как же я люблю косточки...");
    } else {
      System.out.println("Мужик WTF??? это не похоже на кости!!!!");
    }
  }

  @Override
  public void voice() {
    System.out.println("Гав!");
  }
}
