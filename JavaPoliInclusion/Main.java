import vehicles.*;

public class Main {

  public static void main(String[] args) {

    Vehicle v; // = new Vehicle(); // No podemos instanciar una clase abstracta
    // v.turnOnEngine();
    // v.turnOffEngine();

    v = new StandardCar(); // Polimorfismo con clases, tipo dinámico != estático
    v.turnOnEngine();
    ((StandardCar) v).drive(); // v es Vehicle, pero drive está definido en StandardCar!
    v.turnOffEngine();  // Implementación por defecto en clase abstracta

    Flyable fv = new FordAnglia(); // Polimorfismo con interfaces
    fv.fly();
    ((Driveable) fv).drive(); // Casting para recuperar el tipo dinámico
    ((Vehicle) fv).turnOnEngine();
    ((FordAnglia) fv).turnOffEngine();

    System.out.println("*** Comprobamos el tipo dinámico ***");
    System.out.println(v.getClass().getName());
    System.out.println(fv.getClass().getName());
  }

}
