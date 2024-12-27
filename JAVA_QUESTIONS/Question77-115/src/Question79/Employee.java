package Question79;

class Employee {
    private String name;
    private int age;
    private int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Access Modifier default
    void displayEmployeeDetail(){
        System.out.printf("Employee Name is %s - %d -%d",this.name,this.age,this.salary);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary='").append(salary).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
