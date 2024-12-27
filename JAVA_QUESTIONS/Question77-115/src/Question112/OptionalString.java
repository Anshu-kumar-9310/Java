package Question112;

import java.util.Optional;

public class OptionalString {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Optional Class of String.");


        System.out.println(OptionalClassString(""));
        System.out.println(OptionalClassString(null));
        System.out.println(OptionalClassString("anshu"));
    }

    public static Optional<String> OptionalClassString(String str){
        if (str == null || str.isEmpty()){
            return Optional.empty();
        }else {
           return Optional.of(str.toUpperCase());
        }
    }
}
