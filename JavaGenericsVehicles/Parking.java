import java.util.ArrayList;

public class Parking<V extends Vehicle> {
  private final int numPlaces;
  private final ArrayList<V> places;

  public Parking(int numPlaces) {
    this.numPlaces = numPlaces;
    places = new ArrayList<>(numPlaces);
  }

  public void park(V vehicle) {
    if (places.size() >= this.numPlaces) {
      System.out.println("\033[31;1;4mParking lleno\033[0m");
      return;
    }

    places.add(vehicle);
    System.out.println(vehicle + " aparcado");
  }
}
