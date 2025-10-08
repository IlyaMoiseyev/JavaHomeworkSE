package lesson14.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class University {
  private String universityName;
  private List<Student> studentsList;

  public University() {
    this("БГУИР", new ArrayList<>());
  }

  public University(String universityName, List<Student> studentsList) {
    this.universityName = universityName;
    this.studentsList = studentsList;
  }

  public String getUniversityName() {
    return universityName;
  }

  public void setUniversityName(String universityName) {
    this.universityName = universityName;
  }

  public List<Student> getStudentsList() {
    return studentsList;
  }

  public void setStudentsList(List<Student> studentsList) {
    this.studentsList = studentsList;
  }

  public void admissionOfStudents() {
    System.out.println(universityName + " открывает свои двери! Идет прием студентов!");
    for (int i = 0; i < 10; i++) {
      Student student = new Student();
      studentsList.add(student);
      System.out.println("зачислен: " + student.getGeneralMinInfoAboutStudent());
    }
  }

  public void startLearningProcess() {
    System.out.println("-------------------------------------");
    System.out.println("Начался процесс обучения! идут занятия...");
    startLesson(studentsList, "математика", 1);
    startLesson(studentsList, "физика", 1);
    startSession();
  }

  public void startLesson(List<Student> listOfStudents, String subject, int lessonOrExam) {
    System.out.println("-------------------------------------");
    String type = (lessonOrExam == 2 ? "экзамен" : "урок");
    System.out.println("Начался " + type + "  по предмету: " + subject + "!");

    for (Student student : listOfStudents) {
      int score = getScore();
      System.out.println(student.getName() + " получил оценку: " + score);
      if (subject.equals("математика")) {
        if (type.equals("урок")) {
          student.setMathScore(score);
        } else {
          student.setMathExamScore(score);
        }
      } else if (subject.equals("физика")) {
        if (type.equals("урок")) {
          student.setPhysicsScore(score);
        } else {
          student.setPhysicsExamScore(score);
        }
      }
    }
  }

  public void startSession() {
    System.out.println("-------------------------------------");
    System.out.println("Стартовала сессия!");
    startLesson(studentsList, "математика", 2);
    startLesson(studentsList, "физика", 2);
    checkingAverageScore(studentsList);
  }

  public void checkingAverageScore(List<Student> listOfStudents) {
    List<Student> exclusionList = new ArrayList<>();
    System.out.println("-------------------------------------");
    System.out.println("Сессия завершена! Идет проверка среднего балла.");

    for (Student student : listOfStudents) {
      if (student.getAverageScore() < 3) {
        System.out.println("Студент "
                + student.getGeneralMinInfoAboutStudent()
                + ", средний балл: "
                + student.getAverageScore() +
                " - отчислен за неуспеваемость!");
        exclusionList.add(student);
      } else if (student.getCourse() <= 5) {
        System.out.println("Студент "
                + student.getGeneralMinInfoAboutStudent()
                + ", успешно сдал сессию, средний балл "
                + student.getAverageScore()
                + ", переведен на следующий курс!");
        student.setCourse(student.getCourse() + 1);
      } else {
        System.out.println("Студент "
                + student.getGeneralMinInfoAboutStudent()
                + ", успешно сдал сессию и выпустился из университета!!!");
        exclusionList.add(student);
      }
    }
    startExclusionStudents(exclusionList);
  }

  public void startExclusionStudents(List<Student> exclusionList) {
    for (Student student : exclusionList) {
      studentsList.remove(student);
    }
  }

  public int getScore() {
    return new Random().nextInt(1, 6);
  }

  public void showListOfStudents() {
    for (Student student : studentsList) {
      System.out.println(student);
    }
  }

  public void printStudents(List<Student> students, int course) {
    System.out.println("Поиск студентов по курсу: " + course + ".......");
    boolean isContains = false;

    for (Student student : students) {
      if (student.getCourse() == course) {
        System.out.println(student);
        isContains = true;
      }
    }
    if (!isContains) {
      System.out.println("Студенты на куре " + course + " отсутствуют! Введите другой курс =)");
    }
  }
}
