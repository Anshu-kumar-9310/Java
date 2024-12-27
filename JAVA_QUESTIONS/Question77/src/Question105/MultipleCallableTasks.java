package Question105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultipleCallableTasks {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Welcome in the world of execute multiple Callable tasks.");

        try{

            // make executes services
            ExecutorService execute = Executors.newFixedThreadPool(3);

            // make list of futures of Integer for storing result
            List<Future<Integer>> listOfResult = new ArrayList<>();

            // tasks
            for (int i = 0; i <= 10; i++) {
                // create an object
                FactorialClass task = new FactorialClass(i);
                // store future return factorial in result
                Future<Integer> result = execute.submit(task);
                // add result in list of future of Integer
                listOfResult.add(result);
            }

            // Print the list of future Integer for Factorial
            for (Future<Integer> integerFuture : listOfResult) {
                System.out.println("Factorial is "+integerFuture.get());
            }

            //execute shutdown
            execute.shutdown();

            // wait for all tasks to finish executing or timeout after 10 seconds
            if (!execute.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Enough!");
                execute.shutdownNow();
            }

        } catch (Exception e) {
            System.out.println("I got an error."+e.getMessage());
            //throw new RuntimeException(e);
        }

    }
}
