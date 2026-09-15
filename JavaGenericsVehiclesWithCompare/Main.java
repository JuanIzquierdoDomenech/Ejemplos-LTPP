class Main {
    public static void main(String[] args) {
        Parking<Vehicle> p1 = new Parking<>(5);
        p1.park(new FordAnglia());
        p1.park(new KnightBus());
        p1.park(new FordAnglia());
        p1.park(new KnightBus());
        p1.park(new FordAnglia());
        p1.park(new KnightBus());

        Parking<Vehicle> p2 = new Parking<>(10);
        System.out.println(p1.compareTo(p2)); // +- Sobrecarga de operadores mediante implementación de interfaces
                                              // genéricas
        // p1.compareTo(new Integer(213));
    }
}