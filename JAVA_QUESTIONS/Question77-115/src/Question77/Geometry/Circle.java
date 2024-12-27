package Question77.Geometry;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea(){
        double Area = Math.PI*Math.pow(this.radius,2);
        System.out.println("Area of circle is "+Area);
    }
}
