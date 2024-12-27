package Question77.Utilis;

// import from Geometry package
import Question77.Geometry.Circle;
import Question77.Geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle c = new Circle(3.9);
        c.getArea();
        Rectangle r = new Rectangle(12.4,42);
        r.getArea();
    }
}
