package vehicles;

public class FordAnglia extends Vehicle implements Flyable {

  // Flyable
  @Override
  public void fly() {
    System.out.println("Vamonos a Hogwarts!!");
  }

  // Driveable
  @Override
  public void drive() {
    System.out.println("Vamos de paseo!!");
  }

  // Vehicle
  @Override
  public void turnOnEngine() {
    System.out.println("Ponte el cinturón y protege tu vida!!");
  }

  // Vehicle
  @Override
  public void turnOffEngine() {
    System.out.println("Aparcao así así!!");
  }
}
