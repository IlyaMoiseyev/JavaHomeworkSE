package lesson9.shallowAndDeepCloning;
import java.util.Objects;

public class Smartphone implements Cloneable {
  private String brand;
  private String model;
  private int yearOfRealise;

  public Smartphone() {
    this("Samsung", "S22 Ultra", 2022);
  }

  public Smartphone(String brand, String model, int yearOfRealise) {
    this.brand = brand;
    this.model = model;
    this.yearOfRealise = yearOfRealise;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYearOfRealise() {
    return yearOfRealise;
  }

  public void setYearOfRealise(int yearOfRealise) {
    this.yearOfRealise = yearOfRealise;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Smartphone that = (Smartphone) o;
    return yearOfRealise == that.yearOfRealise && Objects.equals(brand, that.brand) && Objects.equals(model, that.model);
  }

  @Override
  public String toString() {
    return "Smartphone{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", yearOfRealise=" + yearOfRealise +
            '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, yearOfRealise);
  }

  @Override
  protected Smartphone clone() throws CloneNotSupportedException {
    return (Smartphone) super.clone();
  }
}
