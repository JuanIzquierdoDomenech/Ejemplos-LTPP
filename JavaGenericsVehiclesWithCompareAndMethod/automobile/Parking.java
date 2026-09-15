package automobile;

import automobile.interfaces.Vehicle;

import java.util.ArrayList;

public class Parking<V extends Vehicle> implements Comparable<Parking> {
  private final int numPlaces;
  private final ArrayList<V> places;

  public Parking(int numPlaces) {
    this.numPlaces = numPlaces;
    places = new ArrayList<>(numPlaces);
  }

  public void Park(V vehicle) {
    if (places.size() >= this.numPlaces) {
      System.out.println("Parking lleno");
      return;
    }

    places.add(vehicle);
    System.out.println(vehicle + " aparcado");
  }

  public ArrayList<V> getPlaces() {
    return places;
  }

  @Override
  public int compareTo(Parking other) {
    if (other.numPlaces < this.numPlaces)
      return 1;
    if (other.numPlaces > this.numPlaces)
      return -1;
    return 0;
  }
}
