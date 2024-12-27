import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Grade Checker world");
        System.out.print("Enter your Marks : ");
        float Marks =(float) input.nextDouble();

        if (Marks > 90) {
            System.out.println("Grade A");
        } else if (Marks > 75) {
            System.out.println("Grade B");
        }else if (Marks > 60) {
            System.out.println("Grade C");
        }else if (Marks > 30) {
            System.out.println("Grade D");
        }else if (Marks <= 30) {
            System.out.println("Grade F");
        }
    }
}
