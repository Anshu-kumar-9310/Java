package Question84;

public interface Flyable {

    // 1 away
    public abstract void fly();


    // 2nd way
    // Interface methods are inherently public and abstract, except for default and static methods
     void fly2();


    //Interfaces can have default and static methods with implementation only.
    default void fly3() {
        System.out.println("Hello world from Interface --> Default method.");
    }

     static void fly4(){
         System.out.println("Hello world from Interface --> Static method.");
    }
}
