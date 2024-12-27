package Question103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadedExecutor {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of single-threaded executor service.");

        // create a executor with single threaded Executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Define tasks (a Runnable)
        PrintTask task1 = new PrintTask('#');
        PrintTask task2 = new PrintTask('$');

        // submit tasks to executor
        executor.submit(task2);
        executor.submit(task1);

        // shutdown executor
        executor.shutdown();
    }
}
