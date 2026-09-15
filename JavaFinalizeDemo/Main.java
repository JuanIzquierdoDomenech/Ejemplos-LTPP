class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program starts!");

        long start = System.currentTimeMillis();

        Square sq = new Square();

        sq = null;

        Thread.sleep(5000);

        // System.gc(); // se deberian ejecutar los finalize(), pero mejor no confiar en ellos...

        System.out.println("Program ends!");
    }
}