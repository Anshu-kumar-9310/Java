package Question104;

public class SleepTask implements Runnable{

    private int Random(){
        return (int) Math.floor(Math.random() * 5) + 1;
    }

    @Override
    public void run() {
        System.out.println("Thread Start: "+Thread.currentThread().getName());

        try {
            Thread.sleep(Random() * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Ended: "+Thread.currentThread().getName());

    }
}
