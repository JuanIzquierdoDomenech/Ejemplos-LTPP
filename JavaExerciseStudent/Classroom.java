import java.util.ArrayList;

public class Classroom<T extends Student> {

  private ArrayList<T> students;
  public Subject[] subjects;

  public Classroom(int capacity, Subject[] subjects) {
    students = new ArrayList<>(capacity);
    this.subjects = subjects;
  }

  public void addStudent(T student) {
    students.add(student);
  }

  public T getStudent(int index) {
    return students.get(index);
  }
}
