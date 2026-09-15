public class KnightBus implements Vehicle {

  private int gear;
  private int speed;
  final int knightStrength = 2;

  @Override
  public void changeGear(int gear) {
    this.gear = gear;
  }

  @Override
  public void accelerate(int intensity) {
    this.speed += intensity * knightStrength;
  }

  @Override
  public void brake(int intensity) {
    this.speed -= intensity * knightStrength;
  }

  @Override
  public String toString() {
    return String.format("Knight bus: gear %d speed %d", gear, speed);
  }

}
