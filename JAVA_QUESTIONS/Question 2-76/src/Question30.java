import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Factorial");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        int i = 2;
        int fact = 1;
        if (num <= 0){
            fact = 0;
        }
        while(i <= num){
            fact *= i;
            i++;
        }

        System.out.println("Factorial is: "+fact);
    }
}
