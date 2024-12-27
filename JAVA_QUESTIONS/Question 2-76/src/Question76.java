public class Question76 {
    private final String name;
    private final int age;
    private final String course;

    public Question76(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Question76{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", course='").append(course).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of final keyword.");
        Question76 stu = new Question76("Anshu",20,"Master Diploma in Computer Science");
        System.out.println(stu);
    }
}
