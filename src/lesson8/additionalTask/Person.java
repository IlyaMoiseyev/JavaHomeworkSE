package lesson8.additionalTask;

public class Person implements Cloneable {
  private String name;
  private int age;
  private String male;
  private Book book;

  public Person() {
    this("Инокентий", 87, "мужской");
  }

  public Person(String name, int age, String male) {
    this.name = name;
    this.age = age;
    this.male = male;
    book = new Book();
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

  public String getMale() {
    return male;
  }

  public void setMale(String male) {
    this.male = male;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public void getInfoAboutPerson() {
    System.out.println("Я " + getName());
    System.out.println("Мне " + getAge() + " лет");
    System.out.println("Мой пол " + getMale());
  }

  public void readTheBook() {
    System.out.println("Читаю книгу " + book.getTitle() + ", автора " + book.getAuthor());
  }

  public Person clone() throws CloneNotSupportedException {
    Person clonedPerson = (Person) super.clone();
    clonedPerson.book = book.clone();
    return clonedPerson;
  }
}
