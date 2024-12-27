package Question114;

public class EmployeeDetail {

    private final String name;

    private final int salary;

    public EmployeeDetail(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+" : "+salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
