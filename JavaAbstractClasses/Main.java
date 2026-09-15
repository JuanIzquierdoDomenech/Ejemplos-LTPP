import enemies.Basilisk;
import enemies.Enemy;
import enemies.Voldemort;

class Main {
  public static void main(String[] args) {
    // Enemy e = new Enemy(); // Error, no se pueden instanciar
    Basilisk b = new Basilisk("Ekans");
    b.attack(null);
    b.defend();
    b.flee();

    Enemy v = new Voldemort("Tom Riddle"); // Instanciamos clases derivadas, Polimorfismo!!
    v.attack("Avada Unakabra");
    v.defend();
    ((Voldemort) v).scare(); // Polimorfismo!!
    v.flee();

    v = b; // OMG!
    v.attack(null);
  }
}