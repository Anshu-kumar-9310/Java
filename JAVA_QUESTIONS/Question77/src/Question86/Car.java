package Question86;

public class Car extends Vehicle{

    @Override
    public void service(){
        System.out.println("Hello from Car class which override Vehicle method.");
        // call parent method with the help of super keyword
        super.service();
    }


    public static void main(String[] args) {
        System.out.println("Welcome in the world of method overriding.");
        Vehicle v = new Vehicle();
        Car c = new Car();

        v.service();
        c.service();
    }
}
