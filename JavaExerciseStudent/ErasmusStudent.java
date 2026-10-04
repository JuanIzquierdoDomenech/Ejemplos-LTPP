public class ErasmusStudent extends Student {

    public ErasmusStudent(String name, String ID, int age, Subject[] subjects) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.subjects = subjects;
    }
    @Override
    public String toString() {
        String parentString = super.toString();

        return parentString + "Student Type: Erasmus\n";
    }
}
