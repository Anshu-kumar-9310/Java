import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Bitwise NOT(compliment) Operator");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();


        int result  = ~ num;

        System.out.println("Bitwise NOT(compliment) of numbers is: "+result);

    }
}
