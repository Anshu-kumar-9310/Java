package Question100;

//STEP 1: IMPLEMENTS Runnable Class
public class ThreadStatePrinting implements Runnable{

    // STEP 2: OVERRIDE RUN METHOD
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("Printing Thread State From Inside Class: "+Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
