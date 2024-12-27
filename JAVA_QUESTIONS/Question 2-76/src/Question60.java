import java.util.Scanner;

public class Question60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Number Guessing Game.");

        int ComputerNumber = (int) Math.floor(Math.random() * 10 + 1);

        int number;
        do {
            System.out.print("Enter your Number between 1-10: ");
            number = input.nextInt();
        } while (number != ComputerNumber);
        System.out.println("You won the Game.");


    }
}
