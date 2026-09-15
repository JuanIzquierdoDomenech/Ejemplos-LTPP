public class Main {

  public static void recursiveInfiniteAndBeyond(int n) {
    if (n == 0)
      return;

    recursiveInfiniteAndBeyond(n + 1);
  }

  public static void main(String[] args) {
    recursiveInfiniteAndBeyond(-10);

    System.out.println("---");

    recursiveInfiniteAndBeyond(10);
    /*
     * Exception in thread "main" java.lang.StackOverflowError at
     * Main.recursiveInfiniteAndBeyond(Main.java:6)
     */

    // En tiempo de ejecución, NO DEBEMOS manejar este problema
    // No podemos hacer nada para 'crear stack'
  }
}