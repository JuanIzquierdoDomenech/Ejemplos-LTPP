public class LocalStudent extends Student {

    public LocalStudent(String name, String ID, int age, Subject[] subjects) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        // Use the parent class's toString method
        String parentString = super.toString();

        return parentString + "Student Type: Local\n";
    }
}
