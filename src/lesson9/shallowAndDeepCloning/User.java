package lesson9.shallowAndDeepCloning;
import java.util.Objects;

public class User implements Cloneable {
  private String name;
  private int age;
  private final int id;
  private Smartphone smartphone;
  private boolean shallowOrDeep;

  public User() {
    this("Яромир", 35, new Smartphone("Nokia", "3310", 2000));
  }

  public User(String name, int age, Smartphone smartphone) {
    this.name = name;
    this.age = age;
    id = (int) (Math.random() * 10000) + 300;
    this.smartphone = smartphone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public Smartphone getSmartphone() {
    return smartphone;
  }

  public void setSmartphone(Smartphone smartphone) {
    this.smartphone = smartphone;
  }

  public void changeSmartphone(String brand, String model, int yearOfRealise) {
    smartphone.setBrand(brand);
    smartphone.setModel(model);
    smartphone.setYearOfRealise(yearOfRealise);
  }

  public void setShallowOrDeep(boolean shallowOrDeep) {
    this.shallowOrDeep = shallowOrDeep;
  }

  public boolean isShallowOrDeep() {
    return shallowOrDeep;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return age == user.age && id == user.id && Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, id);
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", id=" + id +
            ", smartphone=" + smartphone +
            "}";
  }

  @Override
  protected User clone() throws CloneNotSupportedException {
    User clonedUser = (User) super.clone();
    if (isShallowOrDeep()) {
      clonedUser.smartphone = smartphone.clone();
    }
    return clonedUser;
  }
}
