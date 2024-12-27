import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Year Checker world");
        System.out.print("Enter your Year : ");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Your Year is Leap Year");
        } else if (year % 400 ==0) {
            System.out.println("Your Year is Leap Year");
        } else {
            System.out.println("Your Year is Normal year");
        }
    }
}
