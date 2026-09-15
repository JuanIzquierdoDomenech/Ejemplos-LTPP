import geometry.polygons.Square;
import geometry.*;

class Main {
    public static void main(String[] args) {

        // Como importamos geometry.* y Point.java se encuentra en ese nivel, accedemos directamente
        Point p = new Point();

        // Fully qualified name
        geometry.polygons.Square sq1 = new geometry.polygons.Square();
        // Como hemos importado esa clase en especifico, no hace falta el FQN
        Square sq2 = new Square();

        // FQN
        geometry.polygons.Circle c = new geometry.polygons.Circle();
    }
}