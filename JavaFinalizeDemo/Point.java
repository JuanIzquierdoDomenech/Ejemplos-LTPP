public class Point {

    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int newx, int newy) {
        x = newx;
        y = newy;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Point -> finalize() executed!");
        super.finalize();
    }
}