package Question99;

// STEP 1: EXTENDS THREAD CLASS
public class MakeThreadClass extends Thread{

    private final int ThreadNumber;

    public MakeThreadClass(int num) {
        this.ThreadNumber = num;
    }

    //STEP 2: OVERRIDE RUN METHOD.
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("(%d) Hello from Thread %d\n",i,ThreadNumber);
        }
    }


}
