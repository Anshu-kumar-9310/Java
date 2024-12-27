import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in greater number Checker world");
        System.out.print("Enter your first number: ");
        double first = input.nextDouble();
        System.out.print("Enter your second number: ");
        double second = input.nextDouble();
        System.out.print("Enter your third number: ");
        double third = input.nextDouble();

        if(first >= second && first >= third){
            System.out.println("Greater Number is: " + first);
        } else if (second >= first && second >= third){
            System.out.println("Greater Number is: " + second);
        }else {
            System.out.println("Greater Number is: " + third);
        }
    }
}
