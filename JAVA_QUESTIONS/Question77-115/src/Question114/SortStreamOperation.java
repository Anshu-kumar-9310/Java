package Question114;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStreamOperation {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of sorts the employees by salary.");

        // create a list of employees
        List<EmployeeDetail> listOfEmployee = List.of(
                new EmployeeDetail("Anshu",20000),
                new EmployeeDetail("Sachin",10000),
                new EmployeeDetail("Bhaiya",50000),
                new EmployeeDetail("Shivam",12000),
                new EmployeeDetail("Mohan",3000),
                new EmployeeDetail("Rohan",5000)

                );

        // Comparator without lambda
        System.out.println("Comparator without lambda.");
        listOfEmployee.stream().sorted(new Comparator<EmployeeDetail>() {
            @Override
            public int compare(EmployeeDetail o1, EmployeeDetail o2) {
                return o1.getSalary() - o2.getSalary();
            }
        }).forEach(emp -> System.out.println(emp));


        // Comparator with lambda
        // store value back in variable list of type List<EmployeeDetail>
        System.out.println("Comparator with lambda and with store value back in variable.");
        List<EmployeeDetail> list = listOfEmployee.stream()
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        System.out.println("Comparator with lambda and without store value back in variable.");
        //Direct Print with storing
        listOfEmployee.stream().sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary()).forEach(System.out::println);
    }
}
