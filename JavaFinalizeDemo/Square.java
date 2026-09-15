public class Square {
    Point topLeft;
    Point bottomRight;

    public Square() {
        this(new Point(), new Point());
    }

    public Square(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Square -> finalize() executed!");

        this.topLeft = null;
        this.bottomRight = null;

        super.finalize();
    }
}