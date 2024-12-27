import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Even/Odd with the help of Bitwise Operator");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int result = num & 1;
        if(result == 1){
            System.out.println("Number is Odd");
        }else {
            System.out.println("Number is Even");
        }
    }
}
