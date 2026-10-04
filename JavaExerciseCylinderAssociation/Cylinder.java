public class Cylinder {

    private double height;
    private final Circle circle;

    public Cylinder() {
        this(1, Circle.Color.Blue, 1);
    }

    public Cylinder(double radius, Circle.Color color, double height) {
        circle = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return circle.radius;
    }

    public Circle.Color getColor() {
        return circle.color;
    }

    public void setRadius(double radius) {
        this.circle.radius = radius;
    }

    public void setColor(Circle.Color color) {
        this.circle.color = color;
    }

    public double getArea() {
        return 2 * circle.getArea() + height * (2 * Circle.PI * circle.radius);
    }

    public double getVolume() {
        double baseArea = circle.getArea(); // Area of the circular base
        return baseArea * height;
    }
}
