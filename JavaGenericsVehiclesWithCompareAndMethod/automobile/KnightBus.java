package automobile;

import automobile.interfaces.Vehicle;

public class KnightBus implements Vehicle {

  @Override
  public void turnOn() {
    System.out.println("Knight Bus turning on");
  }

  @Override
  public void turnOff() {
    System.out.println("Knight Bus turning off");
  }

  @Override
  public String toString() {
    return "Knight Bus";
  }
}
