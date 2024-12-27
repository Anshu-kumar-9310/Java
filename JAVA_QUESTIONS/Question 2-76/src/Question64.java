import java.util.Scanner;

public class Question64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Occurrences of array Element: ");
        // in this question we use Utility getArrayFromUser() method for getting array from user
        int[] array = Utility.getArrayFromUser();

        // get the element
        System.out.print("Enter your element which you want to search in array: ");
        int elem = input.nextInt();

        // Occurrences
        if (array.length<=0){
            System.out.println("Your element is Occur 0 times");
        }else {
            int times = Utility.arrayOccurrences(array, elem);
            System.out.printf("Your element is Occur %d times", times);
        }

    }
}
