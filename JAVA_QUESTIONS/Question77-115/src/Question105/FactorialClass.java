package Question105;

import java.util.concurrent.Callable;

public class FactorialClass implements Callable<Integer> {

    private final int num;

    public FactorialClass(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        // sleep thread for 2 sec
        Thread.sleep(2000);

        // find factorial
        int result = 1;
        if (num <= 1){
            return result;
        }
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
