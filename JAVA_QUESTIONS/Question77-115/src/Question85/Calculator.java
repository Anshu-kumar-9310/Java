package Question85;

public class Calculator {

    // METHOD OVERLOADING:
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b, double c, double d){
        return a+b+c+d;
    }
    public double add(double a, double b ){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("welcome in the world of method overloading.");
        Calculator c = new Calculator();
        System.out.println("Addition of two numbers is: "+c.add(2,3));
        System.out.println("Addition of three numbers is: "+c.add(2,3,4));
        System.out.println("Addition of four double numbers is: "+c.add(3,4,6,4));
        System.out.println("Addition of two double number: "+c.add(4.4,5.8));


    }
}
