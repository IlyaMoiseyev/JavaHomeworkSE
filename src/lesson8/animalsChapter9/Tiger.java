package lesson8.animalsChapter9;

public class Tiger extends Animal {

  public Tiger() {
    this("Тигр", 7);
  }

  public Tiger(String type, int age) {
    super(type, age);
  }

  @Override
  public void eat(String food) {
    if (food.equalsIgnoreCase("мясо")) {
      System.out.println("мммммм мяско, как же я люблю мясо...");
    } else {
      System.out.println("Мужик WTF??? разве " + food + " похож на мясо?!");
    }
  }

  @Override
  public void voice() {
    System.out.println("Р-р-р-р-р");
  }
}
