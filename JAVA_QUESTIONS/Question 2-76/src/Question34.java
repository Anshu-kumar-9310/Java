import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Prime Number");
        System.out.print("Enter Your Number: ");
        int num1 = input.nextInt();

        int i =2;
        boolean isPrime=true;
        while(i<num1){
            if(num1%i==0){
                isPrime = false;
                break;
            }
            i++;
        }
        System.out.println("Your number is: "+ (isPrime ? "Prime" : "Not Prime"));
    }
}
