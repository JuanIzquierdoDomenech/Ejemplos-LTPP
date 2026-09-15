package vehicles;

public class StandardCar extends Vehicle {

  // Driveable
  @Override
  public void drive() {
    System.out.println("Conduciendo el coche standard!!");

  }

  // Vehicle
  @Override
  public void turnOnEngine() {
    System.out.println("Encendiendo un coche estandar");
  }

}
