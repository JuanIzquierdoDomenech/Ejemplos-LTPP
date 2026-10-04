public class Main {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    Circle c2 = new Circle(3, Circle.Color.Green);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c1.equals(c1));
    System.out.println(c1.equals(c2));
  }
}