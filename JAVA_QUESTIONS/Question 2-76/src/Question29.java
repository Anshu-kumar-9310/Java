import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Sum of Odd numbers");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        int i=1;
        int sum=0;
        while(i <= num){
            if(i % 2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of Odd Numbers is: "+sum);
    }
}
