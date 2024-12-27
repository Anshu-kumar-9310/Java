import java.util.Scanner;

public class Question67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Print Even Number: ");

        System.out.print("Enter the upto range of Even Number you want to print: ");
        int num = input.nextInt();

        System.out.print("Even numbers is: ");
        for (int i = 0; i <= num; i++) {
            if(i%2 != 0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
