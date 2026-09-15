class Point /*implements Summable*/ {
    private int x;
    private int y;

    // Sobrecarga aplicada a constructores
    public Point() {
        this(0, 0); // Constructor chaining!
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // No permite sobrecargar operadores como el +
    public Point add(Point other) {
        // Opción 1 -> No modifica this
        // return new Point(x + other.x, y + other.y);

        // Opción 2 -> Modifica this
        this.x += other.x;
        this.y += other.y;
        return this;
    }

    // Sobrecarga de add() dado que el tipo/número de argumentos es distinto
    public Point add(int x, int y) {
        this.x += x;
        this.y += y;
        return this;
    
      // return this.add(new Point(x, y));
    }

    public Point subtract(Point other) {
        this.x -= other.x;
        this.y -= other.y;
        return this;
    }

    public Point subtract(int x, int y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    @Override
    public String toString() {
        return String.format("X:%d Y:%d", x, y);
    }
}