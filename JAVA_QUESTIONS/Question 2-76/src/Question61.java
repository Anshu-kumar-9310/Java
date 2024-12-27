import java.util.Scanner;

public class Question61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of table with the help of For Loop.");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num +" X " +i +" = "+num*i);
        }
    }
}
