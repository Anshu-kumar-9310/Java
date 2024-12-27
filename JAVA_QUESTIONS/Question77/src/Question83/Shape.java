package Question83;

public abstract class Shape {
    public String name;

    public abstract double CalculateArea();

    public void Greeting(){
        System.out.println("Hello Morning.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
