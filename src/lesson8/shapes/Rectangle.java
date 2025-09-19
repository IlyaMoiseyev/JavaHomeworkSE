package lesson8.shapes;

public class Rectangle extends Shape {
  private int length;
  private int width;

  public Rectangle() {
    this("Прямоугольник");
  }

  public Rectangle(String type) {
    super(type);
    length = (int) (Math.random() * 10) + 1;
    width = (int) (Math.random() * 10) + 1;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getWidth() {
    return width;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  @Override
  public void calculateSquare() {
    setSquare(width * length);
  }

  @Override
  public void calculatePerimeter() {
    setPerimeter(2 * (length + width));
  }
}
