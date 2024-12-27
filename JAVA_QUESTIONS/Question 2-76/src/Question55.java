import java.util.Scanner;

public class Question55 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world Absolute number.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();


        System.out.println("Your Absolute Number is: "+ (num<0 ? -num :num));
    }
}
