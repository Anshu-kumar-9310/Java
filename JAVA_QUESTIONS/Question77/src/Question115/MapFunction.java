package Question115;

import java.util.List;
import java.util.Optional;

public class MapFunction {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Convert each string to an integer, then again calculating squares of each number using the map operation and sum up the resulting integers");

        // create list of string
        List<String> list = List.of("1","2","3","5","7","4","6","9");

        // Basic way
       Optional<Double> sum = list.stream()
                .map((str) -> Integer.parseInt(str))
                .map((num) -> Math.pow(num,2))
                .reduce((a,b) -> a+b);

        System.out.println("Basic way: Sum of Square Integers is: "+sum.get());



        //Advanced way
        System.out.print("Advanced way: Sum of Square Integers is:  ");
        list.stream()
                .map(Integer::parseInt)
                .map(num -> Math.pow(num,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
