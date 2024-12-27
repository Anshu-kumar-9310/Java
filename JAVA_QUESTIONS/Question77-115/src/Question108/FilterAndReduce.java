package Question108;

import java.util.List;

public class FilterAndReduce {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Filter and Reduce String.");

        // list of String
        List<String> list = List.of("I","Pagal hai kya","am","Dimaag nhi hai kya","a","Stupid hai kya","good","boy","Koi kam ka nahi hai","and","my","name","kya time pass kar raha hai","is","name me kya rakha hai","anshu.");

        String result = list.stream()
                        .filter(str -> str.length() < 10)
                        .reduce("",(a,b) -> a+" "+b);

        System.out.println("Your String is:"+result);

    }
}
