import java.util.Scanner;

public class Question53 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world of min number.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Minimum number is: "+ (num1>num2 ? num2 :num1));
    }
}
