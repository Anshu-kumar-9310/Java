import java.util.Scanner;

public class Question38 {
    public static void isPalindrome(int num){
        int numCopy = num;
        int reverseNumber =0;
        while(num > 0) {
            int lastDigit = num % 10;
            reverseNumber = (reverseNumber*10) + lastDigit;
            num /= 10;
        }

        System.out.println("Your number is: "+(reverseNumber == numCopy ? "Palindrome" : "Not Palindrome"));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Palindrome Number");
        System.out.print("Enter Your Number: ");
        int num1 = input.nextInt();

        isPalindrome(num1);
    }
}
