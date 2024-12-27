import java.util.Scanner;

public class Question36 {
    public static void Fibonacci(int num1){
        if (num1 <= 0){
            System.out.println("Then why you call me.");
        } else if (num1 == 1) {
            System.out.println("Fibonacci Series is: 0");
        }else if (num1 >= 2){
            int first = 0;
            int second = 1;
            System.out.print("Fibonacci Series is: ");
            System.out.print(first + " " + second+ " ");

            int i = 3;
            while (i <= num1){
                int nextNumber = first + second;
                System.out.print(nextNumber + " ");
                 first = second;
                 second = nextNumber;
                i++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Fibonacci Series");
        System.out.print("Enter how many Fibonacci Series you want to print: ");
        int num1 = input.nextInt();

        Fibonacci(num1);
    }
}
