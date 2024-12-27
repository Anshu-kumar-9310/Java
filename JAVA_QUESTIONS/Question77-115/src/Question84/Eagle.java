package Question84;

public class Eagle extends Bird{

    //from interface
    @Override
    public void fly() {
        System.out.println("First fly from interface.");
    }

    // from interface
    @Override
    public void fly2() {
        System.out.println("Second Fly from interface.");
    }

    // from abstract Bird class
    @Override
    public void flying() {
        System.out.println("flying from abstract Bird class.");
    }


    public static void main(String[] args) {
        System.out.println("Welcome in the world of interface.");
        Eagle sac = new Eagle();

        sac.fly();
        sac.fly2();
        sac.fly3();
        // static method from interface
        Flyable.fly4();
        sac.flying();
        sac.anshu();
    }
}
