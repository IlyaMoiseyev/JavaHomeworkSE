package lesson8.shapes;

public class Triangle extends Shape {
  private int sideA;
  private int sideB;
  private int sideC;

  public Triangle() {
    this("Треугольник");
  }

  public Triangle(String type) {
    super(type);
    sideA = (int) (Math.random() * 10) + 5;
    sideB = (int) (Math.random() * 10) + 5;
    sideC = (int) (Math.random() * 10) + 5;
  }

  public int getSideA() {
    return sideA;
  }

  public void setSideA(int sideA) {
    this.sideA = sideA;
  }

  public int getSideB() {
    return sideB;
  }

  public void setSideB(int sideB) {
    this.sideB = sideB;
  }

  public int getSideC() {
    return sideC;
  }

  public void setSideC(int sideC) {
    this.sideC = sideC;
  }

  @Override
  public void calculateSquare() {
    double semiPerimeter = (double) (sideA + sideB + sideC) / 2;
    double perimeter = Math.sqrt(semiPerimeter *
            (semiPerimeter - sideA) *
            (semiPerimeter - sideB) *
            (semiPerimeter - sideC));
    double roundedPerimeter = Math.round((perimeter * 100) / 100);
    setSquare(roundedPerimeter);
  }

  @Override
  public void calculatePerimeter() {
    setPerimeter(sideA + sideB + sideC);
  }
}
