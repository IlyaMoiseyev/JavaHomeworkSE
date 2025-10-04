package lesson14.task3;

/* Задача №3:
   Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
   оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
   Написать метод, который удаляет студентов со средним баллом <3. Если средний
   балл>=3, студент переводится на следующий курс. Дополнительно написать метод
   printStudents(List<Student> students, int course), который получает список студентов и
   номер курса. А также печатает на консоль имена тех студентов из списка, которые
   обучаются на данном курсе. */

public class Main {
  public static void main(String[] args) {
    University universityBSUIR = new University();
    universityBSUIR.admissionOfStudents();
    universityBSUIR.startLearningProcess();
    System.out.println("----------------");
    universityBSUIR.showListOfStudents();
    System.out.println("----------------");
    universityBSUIR.printStudents(universityBSUIR.getStudentsList(),4);
  }
}
