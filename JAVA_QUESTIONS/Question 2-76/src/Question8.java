import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Arithmetic Operators World");
        System.out.print("Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = input.nextInt();

        System.out.println("Result is: ");
        System.out.println("Sum of Number is: "+(num1+num2));
        System.out.println("Sub of Number is: "+(num1-num2));
        System.out.println("Div of Number is: "+(num1/num2));
        System.out.println("Mul of Number is: "+(num1*num2));
        System.out.println("Mod of Number is: "+(num1%num2));

    }
}
