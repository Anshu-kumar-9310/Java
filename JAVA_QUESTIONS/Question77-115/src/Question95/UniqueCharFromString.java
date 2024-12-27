package Question95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharFromString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Unique Character from String.");

        Set<Character> unique = new HashSet<>();

        System.out.print("Enter Your String: ");
        String str = input.nextLine();

        //NOTE: CONVERT THE STRING INTO ARRAY THEN USE LOOP
        // THEN ADD IN THE SET.
        for (char ch : str.toCharArray()) {
            unique.add(ch);
        }

        System.out.printf("Unique Character in your String is: %d",unique.size());

    }
}
