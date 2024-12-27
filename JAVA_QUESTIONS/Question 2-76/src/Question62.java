import java.util.Scanner;

public class Question62 {

    public static void CheckPrime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Check Prime Number.");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        // If num is zero because 0/0 = infinite
        if (num == 0) {
            isPrime = false;
        }

        System.out.println("Your number is: "+(isPrime ? "Prime" : "Not Prime"));
    }

    public static void FindPrime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Find Prime Number.");
        System.out.print("Enter the upto Number ex-upto 100,200 etc.: ");
        //int num = input.nextInt();


    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of Prime Number with the help of For Loop.");

        // Check Prime Number
        CheckPrime();

        // find Prime Number
    }
}
