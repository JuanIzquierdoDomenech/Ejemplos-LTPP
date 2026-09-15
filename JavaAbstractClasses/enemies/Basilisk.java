package enemies;

public class Basilisk extends Enemy {

  public Basilisk(String name) {
    super(name);
  }

  // ---------- Implement methods from Enemy
  @Override
  public void attack(String spell) {
    System.out.println("ssssssss... " + name + " te quiere mirar!");

  }

  @Override
  public void defend() {
    System.out.println("ssssssss... " + name + " se enrolla en su cola!");

  }

  @Override
  public void flee() {
    System.out.println("ssssssss... " + name + " se va por las cañerías...");

  }

}
