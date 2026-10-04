public class Cylinder extends Circle {

  private double height;

  public Cylinder() {
    this(1, Color.Blue, 1);
  }

  public Cylinder(double radius, Color color, double height) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return 2 * super.getArea() + height * (2 * PI * radius);
  }

  public double getVolume() {
    double baseArea = super.getArea(); // Area of the circular base
    return baseArea * height;
  }
}
