package Question83;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
