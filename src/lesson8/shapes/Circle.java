package lesson8.shapes;

public class Circle extends Shape {
  private int radius;

  public Circle() {
    this("Круг");
  }

  public Circle(String type) {
    super(type);
    radius = (int) (Math.random() * 10) + 2;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public void calculateSquare() {
    setSquare((double) Math.round((Math.PI * radius * radius) * 100) / 100);
  }

  @Override
  public void calculatePerimeter() {
    setPerimeter((double) Math.round((Math.PI * 2 * radius) * 100) / 100);
  }
}
