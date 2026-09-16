import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        int value = 0;
        // int divisor = 0; // ArithmeticException
        int divisor = 20;
        try {
            // Path filePath = Paths.get("text_file.txt");
            Path filePath = Paths.get("text_fail.txt"); // IOException <- NoSuchFileException
            scanner = new Scanner(filePath);
            while (scanner.hasNext()) {
                value += scanner.nextInt();
            }
            value /= divisor;
        } catch (IOException e) {
            // Capturar la exception, fichero no existe
            System.out.println("Excepción IO capturada");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Capturar cualquier excepcion, si no es IOException
            System.out.println("Excepción " + e.getClass().getName() + " capturada");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            // +- RAII
            if (scanner != null) {
                scanner.close();
            }
        }

        System.out.println("Total sum is " + value);    // Debería imprimir 1 (36/20=1)
        System.out.println("--- File End ---");
    }
}