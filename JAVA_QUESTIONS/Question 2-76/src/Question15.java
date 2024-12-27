import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in number Checker world");
        System.out.print("Enter your number: ");
        double number = input.nextDouble();

        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }


    }
}
