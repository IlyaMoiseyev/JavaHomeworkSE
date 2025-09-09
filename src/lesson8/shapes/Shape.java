package lesson8.shapes;

public abstract class Shape {
  private String type;
  private double square;
  private double perimeter;

  public Shape(String type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setSquare(double square) {
    this.square = square;
  }

  public double getSquare() {
    return square;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  public double getPerimeter() {
    return perimeter;
  }

  public void printInfoAboutShape() {
    System.out.println("Площадь фигуры " + getType() + " равна: " + getSquare() + ", периметр: " + getPerimeter());
  }

  public abstract void calculateSquare();

  public abstract void calculatePerimeter();
}
