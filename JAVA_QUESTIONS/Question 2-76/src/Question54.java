import java.util.Scanner;

public class Question54 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world of Even/Odd number.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();


        System.out.println("Your Number is: "+ (num%2==0 ? "Even" :"Odd"));
    }
}
