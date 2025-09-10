package lesson8.additionalTaskChapter9;

public class Dog {

  private Dog() {
  }

  public static void eat(String food) {
    if (food.equalsIgnoreCase("кости")) {
      System.out.println("мммммм косточки, как же я люблю косточки...");
    } else {
      System.out.println("Мужик WTF??? это не похоже на кости!!!!");
    }
  }

  public void eatForObject(String food) {
    eat(food);
  }

  public static void voice() {
    System.out.println("Гав!");
  }

  public void voiceForObject() {
    voice();
  }
}
