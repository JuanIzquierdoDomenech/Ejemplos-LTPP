public class Main {
    public static void main(String[] args) /* throws StudentException */ {

        System.out.println("---***___ Welcome to the EPSA ___***---");

        Student s1 = new Student("Espinete");
        Student s2 = new Student("Don Pimpón");
        Student s3 = new Student("Harry Potter");
        Student s4 = new Student("Mario 64");

        Classroom<Student> cl = new Classroom<>(); // Máximo, 3 alumnos

        // KO -- Error de compilación!!
        /*
         * cl.addStudent(s1); cl.addStudent(s2); cl.addStudent(s3); cl.addStudent(s4);
         */
        System.out.println("Si no se maneja la excepción, no podemos continuar");

        // OK

        try {
            cl.addStudent(s1);
            cl.addStudent(s2);
            cl.addStudent(s3);
            // cl.removeStudents();
            cl.addStudent(s4);
        } catch (StudentException e) {
            e.printStackTrace();
            System.out.println("\033[0;33m" + "EXCEPCIÓN: " + e.getMessage());
        }

        System.out.println("\033[0;36mComo hemos manejado la excepción, the show must go on...");

        cl.printAllStudents();
    }
}