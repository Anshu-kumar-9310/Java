package Question101;

public class TestingThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome in the world of Thread join.");

        ThreadClass t1 = new ThreadClass();
        ThreadClass t2 = new ThreadClass();
        ThreadClass t3 = new ThreadClass();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }


}
