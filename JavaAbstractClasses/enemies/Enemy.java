package enemies;

public abstract class Enemy {

  protected final String name;

  // --- Ctor. nunca puede ser abstract
  public Enemy(String name) {
    this.name = name;
  }

  public abstract void attack(String spell);

  public abstract void defend();

  public abstract void flee();

  public void printName() {
    System.out.println("El monstruo se llama " + name);
  }

}
