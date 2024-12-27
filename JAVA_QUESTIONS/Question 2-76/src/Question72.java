class Circle {
    private final int radius;

    public void AreaOfCircle(){
        double Area =   Math.PI * Math.pow(this.radius,2);
        System.out.println("Area of Circle is: "+Area);
    }
    public void CircumferenceOfCircle(){
        double Cir =  2* Math.PI * this.radius;
        System.out.println("Circumference of Circle is: "+Cir);
    }
    Circle(int radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of Circle.");
        Circle c = new Circle(10);
        c.AreaOfCircle();
        c.CircumferenceOfCircle();
    }
}
