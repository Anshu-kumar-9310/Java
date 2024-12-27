import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Age Group Checker world");
        System.out.print("Enter your Age : ");
        float Age =(float) input.nextDouble();

        if (Age > 60) {
            System.out.println("Senior");
        } else if (Age >= 20) {
            System.out.println("Adult");
        }else if (Age >= 13) {
            System.out.println("Teen");
        }else {
            System.out.println("Child");
        }
    }
}
