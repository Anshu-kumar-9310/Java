package Question106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of lambda.");

        // Lambda store in variable. And variable type is Functional Interfaces:
        BinaryOperator<Integer> multi = (a,b) -> a*b;

        int result = multi.apply(5,6);

        System.out.println("Result is: "+result);
    }
}
