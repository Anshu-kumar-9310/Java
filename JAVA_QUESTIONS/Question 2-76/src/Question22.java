import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Bitwise OR Operator");
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int result  = num1 | num2;

        System.out.println("Bitwise OR of numbers is: "+result);

    }
}
