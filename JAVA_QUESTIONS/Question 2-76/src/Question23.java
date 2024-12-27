import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Bitwise XOR Operator");
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int result  = num1 ^ num2;

        System.out.println("Bitwise of XOR numbers is: "+result);

    }
}
