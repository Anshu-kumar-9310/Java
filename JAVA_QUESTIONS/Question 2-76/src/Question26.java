import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Bitwise Right Shift Operator");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

//        divide by 2
        int result  =  num>>1;
//example
//if  result = num<<1 ---->  num/2
// when give 2 then result is 1 and when give 4 then result is 2
//if  result = num<<2 ---->  num/2/2
// when give 2 then result is 0 and when give 4 then result is 1

        System.out.println("Bitwise Right Shift Operator of numbers is: "+result);

    }
}
