import java.util.Scanner;

public class Question68 {

    public static int fibonacci(int num){
        if (num == 1) return 0;
        if (num == 2) return 1;

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void howManyFibonacci(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many Fibonacci series you want.");
        //Enter the certain number
        System.out.print("Enter the number: ");
        int limit = input.nextInt();

        // fibonacci
        System.out.print("Fibonacci Series is: ");
        for (int i = 1; i <= limit; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }

    public static void uptoFibonacci(){
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci series upto a certain number.");
        //Enter the certain number
        System.out.print("Enter the Certain number: ");
        int limit = input.nextInt();

        // fibonacci
        System.out.print("Fibonacci Series is: ");
        int i = 1;
        while (true){
            int result = fibonacci(i);
            if (result > limit){
                break;
            }
            System.out.print(result +" ");
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Fibonacci series.");

        //How many Fibonacci series:
        howManyFibonacci();

        //upto fibonacci series:
        uptoFibonacci();


        // EXAMPLE:
        //Welcome in the world of Fibonacci series.
        //How many Fibonacci series you want.
        //Enter the number: 10
        //Fibonacci Series is: 0 1 1 2 3 5 8 13 21 34


        //Fibonacci series upto a certain number.
        //Enter the Certain number: 10
        //Fibonacci Series is: 0 1 1 2 3 5 8
    }

}
