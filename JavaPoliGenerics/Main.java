public class Main {
  public static void main(String[] args) {
    Box b = new Box();
    b.set(123);

    Integer n;
    n = (Integer) b.get();

    System.out.println(n);
    System.out.println("----------------------");

    String s = "OMG";
    b.set(s);
    // n = (Integer)b.get(); // PUM!!!! 💥💥💥

    try {
      n = (Integer) b.get();
      System.out.println("Try: " + n);
    } catch (ClassCastException ex) {
      System.out.println("*********");
      ex.printStackTrace();
      System.out.println("*********");
    }

    if (b.get() instanceof String) {
      String s2 = (String) b.get();
      System.out.println("If: " + s2);
    }

    System.out.println("-_- BYE BB _-_");
  }
}