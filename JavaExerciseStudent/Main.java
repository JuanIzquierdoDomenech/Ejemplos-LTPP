public class Main {
    public static void main(String[] args) {

        Subject[] subjects = new Subject[] {Subject.PE, Subject.Programming};

        Student st1 = new LocalStudent("Pedro", "2222", 21, subjects);
        Student st2 = new ErasmusStudent("Peter", "444", 24, subjects);

        Classroom<Student> class1 = new Classroom<>(10, subjects);
        class1.addStudent(st1);
        class1.addStudent(st2);

        System.out.println(class1.getStudent(0));
        System.out.println(class1.getStudent(1));
    }
}