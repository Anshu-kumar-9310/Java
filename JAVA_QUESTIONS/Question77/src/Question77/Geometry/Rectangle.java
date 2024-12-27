package Question77.Geometry;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea(){
        double Area = this.length * this.breadth;
        System.out.println("Area of rectangle is "+Area);
    }
}
