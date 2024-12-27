package Question104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorService {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome in the world of Multi Thread Executor Service.");

        // make executor
        ExecutorService  executor = Executors.newFixedThreadPool(3);

        //submit task
        for (int i = 0; i < 10; i++) {
            SleepTask task = new SleepTask();
            executor.submit(task);
        }

        // shutdown executor
        executor.shutdown();

        // wait for all tasks to finish executing or timeout after 10 seconds
        if (!executor.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("Emergency Shutdown! Leave all pending task.");
            executor.shutdownNow();
        }

    }
}
