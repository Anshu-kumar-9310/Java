package Question99;

public class TestingThread {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Thread.");
        //STEP 3: Create a object of your class.
        MakeThreadClass t1 = new MakeThreadClass(1);
        MakeThreadClass t2 = new MakeThreadClass(2);

        // STEP 4: Start the thread.
        t1.start();
        t2.start();
    }
}
