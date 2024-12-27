import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Even/Odd Checker world");
        System.out.print("Enter your number: ");
        double number = input.nextDouble();

        if (number % 2== 0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
