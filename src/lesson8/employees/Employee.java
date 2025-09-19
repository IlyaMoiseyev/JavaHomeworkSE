package lesson8.employees;

public abstract class Employee implements PostPrintable {
  private String name;
  private int age;
  private String post;
  private int experience;

  public Employee(String name, int age, String post, int experience) {
    this.name = name;
    this.age = age;
    this.post = post;
    this.experience = experience;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public String getPost() {
    return post;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public int getExperience() {
    return experience;
  }

  @Override
  public void printPost() {
    System.out.println("Должность: " + getPost());
  }

  public void showInfoAboutEmployee() {
    System.out.println("Работник: " + getName());
    System.out.println("Возраст: " + getAge() + " лет");
    System.out.println("Стаж: " + getExperience() + " года");
  }
}
