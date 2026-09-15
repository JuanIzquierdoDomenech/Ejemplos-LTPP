public class Main {
  public static void main(String[] args) {
    Parking<Vehicle> p1 = new Parking<>(5);
    p1.park(new FordAnglia());
    p1.park(new KnightBus());
    p1.park(new FordAnglia());
    p1.park(new KnightBus());
    p1.park(new FordAnglia());
    p1.park(new KnightBus());

    Parking<FordAnglia> p2 = new Parking<>(3);
    p2.park(new FordAnglia());
    p2.park(new FordAnglia());
    // p2.park(new KnightBus()); // ERROR DE COMPILACIÓN!
  }
}