import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Sum of Digit");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();


        int sum=0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;

            num = num /10;
        }

        System.out.println("Sum of Digit is: "+sum);
    }
}
