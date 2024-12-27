public class Question70 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world of toString().");
        Student s1 = new Student("Anshu",20);

        // first way to call toString()
        System.out.println(s1);

        //second way to call toString()
        String result = s1.toString();
        System.out.println(result);
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    // by default toString method return this -> Student@6acbcfc0
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}