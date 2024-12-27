import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of table");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.println(num +" X " +i +" = "+num*i);
            i++;
        }
    }
}
