import java.lang.Math;

public class Circle {

  public enum Color {
    Red, Green, Blue
  }
  
  private double radius;
  private Color color;

  public static final double PI = 3.1415;

  public Circle() {
    radius = 0;
    color = Color.Red;
  }

  public Circle(double radius, Color color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public Color getColor() {
    return color;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public double getArea() {
    return PI * Math.pow(radius, 2);
  }
}