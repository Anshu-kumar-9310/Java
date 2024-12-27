import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Rectangle Perimeter calculator");
        System.out.print("Enter length of AB side: ");
        double AB = input.nextDouble();
        System.out.print("Enter length of AB side: ");
        double BC = input.nextDouble();
        System.out.print("Enter length of AB side: ");
        double CD = input.nextDouble();
        System.out.print("Enter length of AB side: ");
        double AD = input.nextDouble();

        double perimeter = AB+BC+CD+AD;
        System.out.println("Perimeter of Rectangle ABCD is: "+perimeter);
    }
}
