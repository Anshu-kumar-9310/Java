package Question83;

public class Testing {
    public static void main(String[] args) {

        System.out.println("Welcome in the world of Abstract.");
        // give an error when try to make object of abstract class
        //Shape sh = new Shape();

        Square s = new Square(4);
        Circle c = new Circle(5.2);

        System.out.println("Area of Square is: "+s.CalculateArea());
        s.Greeting();
        s.setName("Square");

        System.out.println("Area of Circle is: "+c.CalculateArea());
        c.Greeting();
        c.setName("Circle");

        System.out.println(s.getName());
        System.out.println(c.getName());
    }
}
