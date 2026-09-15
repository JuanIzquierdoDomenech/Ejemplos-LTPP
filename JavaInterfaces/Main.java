public class Main {

  public static void main(String[] args) {

    // Trabajamos con implementaciones específicas
    Bicycle bi = new Bicycle();
    bi.accelerate(200);
    bi.brake(10);
    bi.changeGear(2);
    System.out.println(bi);

    // O mejor aún, con interfaces
    Vehicle surprise = new KnightBus();
    surprise.accelerate(200);
    surprise.brake(10);
    surprise.changeGear(88);
    System.out.println(surprise);

    surprise = bi; // No es magia, es polimorfismo
    surprise.accelerate(100);
    System.out.println(surprise);
  }

}
