import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Sum Calculator");
        System.out.print("Enter Your First number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second number: ");
        int num2 = input.nextInt();

        System.out.println("Your Sum is: "+num1+num2);
    }
}
