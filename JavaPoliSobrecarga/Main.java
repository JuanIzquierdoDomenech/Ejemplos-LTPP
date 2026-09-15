class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(10, 20);

        p1.add(p2).add(p2);
        System.out.println(p1);
        // p1 + p2; // Error
        // p1 - p2; // Error

        Point p3 = p1.subtract(p2).add(9, 7);
        System.out.println(p3);
    }
}