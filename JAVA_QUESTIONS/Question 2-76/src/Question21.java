import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Bitwise And Operator");
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int result  = num1 & num2;

        System.out.println("Bitwise And of numbers is: "+result);

    }
}
