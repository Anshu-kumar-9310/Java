import java.util.Scanner;

public class Question37 {
    public static int NoOfDigits(int num){
        int digit = 0;
        while (num> 0){
            int abc = num % 10;
            digit++;
            num /= 10;
        }
        return  digit;
    }
    public static void isArmStrong(int num) {
        int power = NoOfDigits(num);
        int numCopy = num;
        int sum = 0;
        while (num > 0){
            int lastDigit = num%10;
            sum += (int) Math.pow(lastDigit,power);
            num /= 10;
        }
        System.out.println("Your Number is: "+(sum==numCopy ? "ArmStrong" : "Not ArmStrong"));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of ArmStrong Number");
        System.out.print("Enter Your Number: ");
        int num1 = input.nextInt();

        isArmStrong(num1);
    }
}
