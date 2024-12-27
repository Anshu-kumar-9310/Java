package Question79;

public class Test {
    public static void main(String[] args) {
        Employee E = new Employee("Anshu",20,20000);
        System.out.println(E.getSalary());
        E.setSalary(50000);
        E.setAge(22);
        System.out.println(E.getAge());
        System.out.println(E.getName());


        E.displayEmployeeDetail();
        E.setName("Anshu Mathur");
        System.out.println();
        System.out.println(E.toString());

    }
}
