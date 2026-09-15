public class Bicycle extends Object implements Vehicle { // Combinación extends + implements

  private int gear;
  private int speed;

  @Override
  public void changeGear(int gear) {
    this.gear = gear;
  }

  @Override
  public void accelerate(int intensity) {
    this.speed += intensity;
  }

  @Override
  public void brake(int intensity) {
    this.speed -= intensity;
  }

  @Override
  public String toString() {
    return String.format("Bicycle: gear %d speed %d", gear, speed);
  }
}
