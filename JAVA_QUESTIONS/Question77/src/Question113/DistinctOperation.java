package Question113;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOperation {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of distinct Operation.");

        // List of Integers
        List<Integer> arr = Arrays.asList(1,2,4,6,3,2,4,5,6,7);

        // Make List Distinct
        List<Integer> distinctInteger= arr.stream().distinct().collect(Collectors.toList());

        // Original list
        System.out.println("Original List: "+arr);
        // Distinct List
        System.out.println("Distinct Integer List: "+distinctInteger);




    }
}
