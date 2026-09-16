import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Dame cosas:");
        Scanner myScan = new Scanner(System.in);
        int a = myScan.nextInt(); // Y si introducimos una string, o un double?
        int b = myScan.nextInt(); // Y sin introducimos un 0?

        int res = a % b;

        System.out.println("Como pete... aquí no llega");

        myScan.close();
    }
}