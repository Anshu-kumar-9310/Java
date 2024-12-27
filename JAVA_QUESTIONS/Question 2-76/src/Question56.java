import java.util.Scanner;

public class Question56 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world Check Student's Score.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks between 1-100: ");
        int marks = input.nextInt();

        System.out.println("Your Grade is: "+(marks>80 ? "High" : marks<50 ? "Low" : "Moderate"));

    }
}
