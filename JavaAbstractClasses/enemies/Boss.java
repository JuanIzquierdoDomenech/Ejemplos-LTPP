package enemies;

public abstract class Boss extends Enemy {

  // --- Ctor. nunca puede ser abstract
  public Boss(String name) {
    super(name);
  }

  public abstract void scare();
}
