package lesson8.animalsChapter9;

public class Rabbit extends Animal {

  public Rabbit() {
    this("Кролик", 5);
  }

  public Rabbit(String type, int age) {
    super(type, age);
  }

  @Override
  public void eat(String food) {
    if (food.equalsIgnoreCase("трава")) {
      System.out.println("травка, как же я люблю травку...");
    } else {
      System.out.println("Это не травка, есть не буду, жду траву!!!!");
    }
  }

  @Override
  public void voice() {
    System.out.println("Хр-хр-хр-хр");
  }
}
