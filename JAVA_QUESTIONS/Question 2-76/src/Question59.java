import java.util.Scanner;

public class Question59 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world of Password Checker.");
        Scanner input = new Scanner(System.in);

        String pass;
        do {
            System.out.print("Enter your Password: ");
            pass = input.next();
        } while (pass.length()<5);
        System.out.println("Your password is:"+pass);
    }
}
