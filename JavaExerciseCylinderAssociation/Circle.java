import java.lang.Math;

public class Circle {

    public enum Color {
        Red, Green, Blue
    }

    protected double radius;
    protected Color color;

    public static final double PI = 3.1415;

    public Circle() {
        this(1, Color.Blue);
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

    @Override
    public String toString() {
        return "Circle: " + radius + ", " + color;
    }

    @Override
    public boolean equals(Object obj) {

        // Check itself
        if (this == obj) {
            return true;
        }

        // Check null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast
        Circle otherCircle = (Circle) obj;

        // Compare attributes
        return Double.compare(this.radius, otherCircle.radius) == 0 &&
                this.color == otherCircle.color;
    }
}