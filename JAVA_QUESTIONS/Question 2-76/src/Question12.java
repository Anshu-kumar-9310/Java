import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Simple Interest calculator");
        System.out.print("Enter Amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        float simpleInterest = (float) (amount * rate * time)/100;
        System.out.println("Your Simple Interest Is: "+simpleInterest);
    }
}
