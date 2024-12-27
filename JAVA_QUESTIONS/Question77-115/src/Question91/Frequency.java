package Question91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of count the frequency of a particular \n" +
                "element in an ArrayList");

        List<Integer> list = Arrays.asList(1,3,2,1,3,5,6,4,7,4,3,5);

        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,3));
        System.out.println(Collections.frequency(list,5));
        System.out.println(Collections.frequency(list,9));
        System.out.println(Collections.frequency(list,4));
    }
}
