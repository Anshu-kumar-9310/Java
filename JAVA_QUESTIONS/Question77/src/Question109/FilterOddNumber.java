package Question109;

import java.util.List;

public class FilterOddNumber {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Filter odd Numbers.");

        // make list of integer
        List<Integer> list = List.of(0,1,2,3,4,5,6,7,8,9,3,5,6,3,4);

        list.stream()
                .filter(num -> num%2 == 1)
                .forEach(num -> System.out.println(num));

    }
}
