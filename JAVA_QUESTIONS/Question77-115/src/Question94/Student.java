package Question94;

public class Student {

    public final String name;

    public final char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name+" : "+grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }
}
