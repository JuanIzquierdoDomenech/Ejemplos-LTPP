package automobile;

import automobile.interfaces.Vehicle;

public class FordAnglia implements Vehicle {

  @Override
  public void turnOn() {
    System.out.println("Ford Anglia turning on");
  }

  @Override
  public void turnOff() {
    System.out.println("Ford Anglia turning off");
  }

  @Override
  public String toString() {
    return "Ford Anglia";
  }
}
