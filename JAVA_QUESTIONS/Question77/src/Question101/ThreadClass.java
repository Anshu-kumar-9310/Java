package Question101;

public class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Start: "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread End: "+Thread.currentThread().getName());
    }

}
