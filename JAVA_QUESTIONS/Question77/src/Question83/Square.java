package Question83;

public class Square extends Shape{
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double CalculateArea() {
        return Math.pow(side,2);
    }
}
