package Question93;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static Question92.SwapElement.Swap;

public class ReversedList {

    public static void reversed(List<Integer> list){
        // 1 way
        //Collections.reverse(list);

        // 2 way
        for (int i = 0; i < list.size()/2; i++) {
            // in this question we use Question92.SwapElement.Swap method;
            Swap(list,i, list.size()-1-i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Reverse list.");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Before Reverse.");
        System.out.println(list);

        reversed(list);

        System.out.println("After Reverse.");
        System.out.println(list);
    }
}
