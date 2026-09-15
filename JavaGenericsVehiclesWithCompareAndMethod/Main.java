import automobile.FordAnglia;
import automobile.KnightBus;
import automobile.Parking;
import automobile.extensions.ParkingExtensions;
import automobile.interfaces.Vehicle;

public class Main {

  public static void main(String[] args) {
    Parking<Vehicle> p1 = new Parking<>(5);
    p1.Park(new KnightBus());
    p1.Park(new KnightBus());
    p1.Park(new FordAnglia());
    p1.Park(new KnightBus());

    System.out.println("-----");

    ParkingExtensions.showCars(p1);

    System.out.println("**********************");

    Parking<FordAnglia> p2 = new Parking<>(5);
    p2.Park(new FordAnglia());
    p2.Park(new FordAnglia());
    p2.Park(new FordAnglia());
    p2.Park(new FordAnglia());

    System.out.println("-----");

    ParkingExtensions.showCars(p2);
  }
}