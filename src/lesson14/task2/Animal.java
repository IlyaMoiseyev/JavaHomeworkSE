package lesson14.task2;

public class Animal {
  private final String type;
  private static final String[] DEFAULT_TYPES = {
          "Собака",
          "Кот",
          "Тигр",
          "Заяц",
          "Волк",
          "Олень",
          "Лев",
          "Кролик",
          "Медведь"
  };

  public Animal() {
    int randomAnimalTypeIndex = (int) (Math.random() * DEFAULT_TYPES.length);
    type = DEFAULT_TYPES[randomAnimalTypeIndex];
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "type='" + type + '\'' +
            '}';
  }
}
