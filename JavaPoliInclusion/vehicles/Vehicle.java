package vehicles;

public abstract class Vehicle implements Driveable {

  public int gear = 0;
  public double petrolAmount = 0;

  // Sin implementación
  public abstract void turnOnEngine();

  // Con implementación por defecto
  public void turnOffEngine() {
    System.out.println("... . . .   .   .   .");
  }

}
