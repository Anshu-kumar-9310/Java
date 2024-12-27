import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Reverse Number");
        System.out.print("Enter Your Number: ");
        int num1 = input.nextInt();

        int reverseDigit=0;
        while (num1>0){
            int lastDigit = num1%10;
            reverseDigit = (reverseDigit*10) +lastDigit;
            num1 = num1/10;
        }

        System.out.println("Reverse Number is: "+reverseDigit);
    }
}
