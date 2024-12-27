package Question92;

import java.util.Arrays;
import java.util.List;

public class SwapElement {

    public static void Swap(List<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp);
    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Element swap of ArrayList.");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Before Swapping.");
        System.out.println(list);

        Swap(list,2,9);
        System.out.println("After Swapping.");
        System.out.println(list);
    }
}
