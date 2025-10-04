package lesson14.task3;

import java.util.Random;

public class Student {
  private String name;
  private int group;
  private int course;
  private int mathScore;
  private int mathExamScore;
  private int physicsScore;
  private int physicsExamScore;
  private final static String[] DEFAULT_NAMES = {
          "Иван", "Валерий", "Дмитрий", "Инокентий",
          "Ибрагим", "Пантилимон", "Виктория", "Анна",
          "Константин", "Александр", "Михаил", "Сергей",
          "Екатерина", "Светлана", "Ульяна", "Ян", "Мария",
          "Инна", "Григорий", "Алёна", "Ярослав", "Лариса",
          "Степан", "Зинаида", "Антон", "Надежда", "Лариса",
          "Аркадий", "Эльвира", "Милана", "Борис", "София"
  };

  public Student() {
    this(DEFAULT_NAMES[getNameIndex()], getRandomGroup(), getRandomCourse());
  }

  public Student(String name, int group, int course) {
    this.name = name;
    this.group = group;

    if (course < 7) {
      this.course = course;
    } else {
      this.course = new Random().nextInt(1, 7);
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public int getMathScore() {
    return mathScore;
  }

  public void setMathScore(int mathScore) {
    this.mathScore = mathScore;
  }

  public int getPhysicsScore() {
    return physicsScore;
  }

  public void setPhysicsScore(int physicsScore) {
    this.physicsScore = physicsScore;
  }

  public int getMathExamScore() {
    return mathExamScore;
  }

  public void setMathExamScore(int mathExamScore) {
    this.mathExamScore = mathExamScore;
  }

  public int getPhysicsExamScore() {
    return physicsExamScore;
  }

  public void setPhysicsExamScore(int physicsExamScore) {
    this.physicsExamScore = physicsExamScore;
  }

  public int getAverageScore() {
    return Math.round((float) (mathScore + mathExamScore + physicsScore + physicsExamScore) / 4);
  }

  public String getGeneralMinInfoAboutStudent() {
    return name + " группа: " + group + ", курс: " + course;
  }

  public static int getNameIndex() {
    return new Random().nextInt(0, DEFAULT_NAMES.length);
  }

  public static int getRandomGroup() {
    return new Random().nextInt(110901, 110955);
  }

  public static int getRandomCourse() {
    return new Random().nextInt(1, 7);
  }

  @Override
  public String toString() {
    return "Имя: " + name +
            " группа: " + group +
            ", курс: " + course +
            ", оценка по математике: " + mathScore +
            ", оценка по физике: " + physicsScore;
  }
}
