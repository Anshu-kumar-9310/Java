package Question103;

public class PrintTask implements Runnable{

    private final char sign;

    public PrintTask(char sign) {
        this.sign = sign;
    }


    @Override
    public void run() {
        //Task
        for (int i = 1; i <= 10; i++) {
            System.out.println("count is: "+sign+" - "+i);
        }
    }
}
