import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Float Multiplication World");
        System.out.print("Enter Your First Number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter Your Second Number: ");
        float num2 =  input.nextFloat();

        System.out.println("Product of float Number is: "+(num1*num2));
    }
}
