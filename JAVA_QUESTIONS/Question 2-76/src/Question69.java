import java.util.Scanner;

public class Question69 {

    public static boolean isPalindrome(String name){

        // one letter always palindrome like -> a, b, f, s etc.
        if(name.length() == 1) return true;

        // if first character and last character not equal then false
        if(name.charAt(0) != name.charAt(name.length()-1)){
            return false;
        }

        // create a new string from old string(removes first and last character)
        String newString = name.substring(1,name.length()-1);

        // again call with new string
        return isPalindrome(newString);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of check if a string is a palindrome using recursion.");

        //Enter
        System.out.print("Enter your string/name: ");
        String name = input.nextLine();

        // check
        System.out.println("Your String/Name is: "+(isPalindrome(name) ? "Palindrome" : "Not Palindrome"));

        // Example:1 -> anshu, sachin, hello etc.
        //Enter your string/name: anshu
        //Your String/Name is: Not Palindrome

        // Example:2 -> a, b, nitin, abcba, abcdcba etc.
        //Enter your string/name: nitin
        //Your String/Name is: Palindrome


    }
}
