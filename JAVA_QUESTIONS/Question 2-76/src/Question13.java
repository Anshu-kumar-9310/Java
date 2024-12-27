import java.util.Scanner;

public class Question13 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome in Compound Interest calculator");
            System.out.print("Enter Amount: ");
            double amount = input.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double rate = input.nextDouble();
            System.out.print("Enter time in years: ");
            double time = input.nextDouble();

            float CompoundInterest =(float) (amount*time*((1+rate)/100));
            System.out.println("Your Compound Interest Is: "+CompoundInterest);
        }


}
