public class Main {
    public static void main(String[] args) {

        Cylinder c = new Cylinder(5, Circle.Color.Blue, 10);

        System.out.println(c.getArea());
        System.out.println(c.getVolume());
    }
}