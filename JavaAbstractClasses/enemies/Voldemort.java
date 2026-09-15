package enemies;

public class Voldemort extends Boss {

  public Voldemort(String name) {
    super(name);
  }

  // ---------- Implement methods from Enemy
  @Override
  public void attack(String spell) {
    System.out.println(String.format("Voldemort lanza %s!", spell));

  }

  @Override
  public void defend() {
    System.out.println("Voldemort se defiente!");
  }

  @Override
  public void flee() {
    System.out.println("Voldemort salvaje se desapareció!");
  }

  // ---------- Implement methods from Boss
  @Override
  public void scare() {
    System.out.println("jejeje, " + name + " se ha sacado su varita... de sauco!");
  }
}
