package Question107;

import java.util.List;

public class StringStream {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Stream of String.");

        // list of String
        List<String> names = List.of("Anshu","Sachin","Rohan","Mohan","Ram","shyam");

        // 1 way
        names.stream().forEach(name -> System.out.println(name));

        // 2 way
        names.forEach(name -> System.out.println(name));

        // 3 way
        names.forEach(System.out::println);
    }
}
