class Course {
    // JAB BHI HUM NEW OBJECT BANAYEGE TAB maxCapacity TO SAME RAHEGI SAB OBJECT KE LIYA
    // PAR enrolledStudents 0 SE START HOGA HAR OBJECT KE LIYA
    // IN SHORT: static variable ki value reset nhi hoti hai jab bhi hum new object banate hai
    public static int maxCapacity;
    public String CourseName;
    private int enrolledStudents =0;

    public void enrollStudent(String studentName){
        if(maxCapacity != enrolledStudents){
            System.out.println("Student is enrolled Successfully. Student name is: "+studentName);
            enrolledStudents++;
        }else{
            System.out.println("Sorry! Course has maximum Capacity.");
        }
    }
    public void unEnrollStudents(String studentName){
        System.out.println("Student has unEnrolled Successfully. Student name is: "+studentName);
        enrolledStudents--;
    }

    public Course(String courseName) {
        CourseName = courseName;
    }

    public void getEnrolledStudents() {
        System.out.println("Enrolled Students is: "+enrolledStudents);
    }

    public static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }
    public static void main(String[] args) {
        Course hacking = new Course("Hacking");
        setMaxCapacity(3);
        hacking.enrollStudent("Anshu");
        hacking.enrollStudent("Shivam");
        hacking.enrollStudent("Sachin");
        hacking.enrollStudent("Sammer");
        hacking.unEnrollStudents("Sachin");
        hacking.enrollStudent("Ashish");
        hacking.enrollStudent("Piyush");
        hacking.getEnrolledStudents();

        Course development = new Course("Web Development");
        development.enrollStudent("Anshu");
        development.getEnrolledStudents();
        development.enrollStudent("Rohit");
        development.enrollStudent("Salman");
        development.enrollStudent("Piyush");
        development.getEnrolledStudents();
    }
}
