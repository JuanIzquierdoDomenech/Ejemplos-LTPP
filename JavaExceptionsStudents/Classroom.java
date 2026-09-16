import java.util.ArrayList;

public class Classroom<T extends Student> {

    private ArrayList<T> mStudents = new ArrayList<>();
    private int mNumStudents = 0;
    public final int MAX_STUDENTS = 3;

    public void addStudent(T s) throws StudentException {

        if (mNumStudents == MAX_STUDENTS)
            throw new StudentException("No caben más alumnos en el aula");

        mStudents.add(s);
        ++mNumStudents;
        System.out.println("\u001B[32m" + "Alumno añadido: " + s.getName());
    }

    public void printAllStudents() {
        mStudents.forEach(System.out::println);
    }

    public void removeStudents() {
        mStudents.clear();
        mNumStudents = 0;
    }

}
