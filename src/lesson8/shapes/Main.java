package lesson8.shapes;

/* Задача 2:
   Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
   функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
   абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
   периметра всех фигур в массиве. */

public class Main {
  public static void main(String[] args) {
    double sumOfPerimeters = 0;
    Shape[] shapes = new Shape[5];
    shapes[0] = new Circle();
    shapes[1] = new Rectangle();
    shapes[2] = new Triangle();
    shapes[3] = new Circle("Круг2");
    shapes[4] = new Rectangle("Прямоугольник2");

    for (Shape shape : shapes) {
      shape.calculateSquare();
      shape.calculatePerimeter();
      shape.printInfoAboutShape();
      sumOfPerimeters += shape.getPerimeter();
    }

    System.out.println("Сумма периметров всех фигур равна: " + sumOfPerimeters);
  }
}
