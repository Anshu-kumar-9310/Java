import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in swap World.");
        System.out.print("Enter Your First number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second number: ");
        int num2 = input.nextInt();
        System.out.println("Before Swapping First Number is "+num1+" And Second Number is "+num2);

        int num3 = num1;
        num1=num2;
        num2=num3;
        System.out.println("After Swapping First Number is "+num1+" And Second Number is "+num2);


    }
}
