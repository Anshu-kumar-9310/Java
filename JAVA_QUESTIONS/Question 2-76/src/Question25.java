import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Bitwise Left Shift Operator");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

// Multiply by 2
        int result  =  num<<1;
//example
//if  result = num<<1 ---->  num*2
// when give 2 then result is 4 and when give 4 then result is 8
//if  result = num<<2 ---->  num*2*2
// when give 2 then result is 8 and when give 4 then result is 16
// if  result = num<<3 ---->  num*2*2*2
// when give 2 then result is 16 and when give 4 then result is 32
        System.out.println("Bitwise Left Shift Operator of numbers is: "+result);

    }
}
