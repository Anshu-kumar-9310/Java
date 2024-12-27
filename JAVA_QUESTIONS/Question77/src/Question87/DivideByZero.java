package Question87;

import java.util.Scanner;

public class DivideByZero{

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome in the world of Divide by zero Exception.");
        try{
            System.out.print("Enter your first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter your second number: ");
            int num2 = input.nextInt();
            int result =  num1/num2;

            System.out.println("Your result is: "+result);
        }catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Divide by Zero is not Possible(Meaningless).");
            }else {
                System.out.println("Arithmetic Exception Occurred.");
            }
        }catch (Exception exception){
            System.out.println("YOU ARE VERY CHALAK BRO.");
        }finally {
            System.out.println("I am always run for close the expensive resources.");
        }


    }
}
