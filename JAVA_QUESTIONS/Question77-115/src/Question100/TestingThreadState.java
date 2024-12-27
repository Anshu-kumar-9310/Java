package Question100;

public class TestingThreadState {

    public static void main(String[] args) throws InterruptedException {
        // STEP 3: Create a Runnable instance
        ThreadStatePrinting t1 = new ThreadStatePrinting();

        // STEP 4  Wrap the Runnable in a Thread
        Thread thread1 = new Thread(t1);
        System.out.println("Thread Create State is: "+ thread1.getState());

        // STEP 5 : START THE THREAD
        thread1.start();


        // Wait for the thread to finish execution
        thread1.join();
        System.out.println("Thread End State is: "+ thread1.getState());
    }
}
