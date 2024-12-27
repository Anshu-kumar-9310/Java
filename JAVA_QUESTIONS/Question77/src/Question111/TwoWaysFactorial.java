package Question111;

import java.util.stream.IntStream;

public class TwoWaysFactorial {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of two ways factorial," +
                " (1).structural(procedural) programming, (2).functional programming.");

        int number = 5;

        // Factorial Using Procedural Programming
        System.out.println("Factorial is: "+FactorialUsingProceduralProgramming(number));

        //Factorial Using Functional Programming
        FactorialUsingFunctionalProgramming(number);

    }

    public static void FactorialUsingFunctionalProgramming(int num){
        IntStream.rangeClosed(2,num)
                .reduce((a,b) -> a*b)
                .ifPresent(System.out::println);

        //Explanation
        // If: IntStream.rangeClosed(2,5) then output: 2,3,4,5
    }
    public static long FactorialUsingProceduralProgramming(int num){
        if (num <= 1){
            return 1;
        }

        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
