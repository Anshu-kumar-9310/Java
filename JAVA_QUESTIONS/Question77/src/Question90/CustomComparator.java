package Question90;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {

    public static void sortInDscOrder(List<String> stringList){

        // without using custom comparator
        //Collections.sort(stringList);
        //Collections.reverse(stringList);


        // with using custom comparator
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.charAt(0) > o2.charAt(0)){
                    return -1;
                } else if (o1.equals(o2)) {
                    return 0;
                }else {
                    return 1;
                }

            }
        });

    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Custom Comparator.");

        List<String> list = Arrays.asList("Anshu","Sachin","Rahul","Sumit","Roni");

        //before sorting
        System.out.println("Before Sorting \n" +list);

        // sort
        sortInDscOrder(list);

        //after sorting
        System.out.println("After Sorting \n" +list);
    }
}
