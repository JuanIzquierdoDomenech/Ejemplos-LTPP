public abstract class Student {

    protected String name;
    protected String ID;
    protected int age;
    protected Subject[] subjects;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("ID: ").append(ID).append("\n");
        sb.append("Age: ").append(age).append("\n");

        if (subjects != null && subjects.length > 0) {
            sb.append("Subjects: \n");
            for (Subject subject : subjects) {
                sb.append("  - ").append(subject.toString()).append("\n");
            }
        } else {
            sb.append("No subjects assigned\n");
        }

        return sb.toString();
    }
}
