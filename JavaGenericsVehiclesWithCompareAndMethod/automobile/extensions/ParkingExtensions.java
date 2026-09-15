package automobile.extensions;

import automobile.Parking;
import automobile.interfaces.Vehicle;

import java.util.List;

public class ParkingExtensions {

  public static <V extends Vehicle> void showCars(Parking<V> p) {
    List<V> vehicle = p.getPlaces();

    vehicle.forEach(v -> System.out.println("Vehicle -> " + v));
  }
}
