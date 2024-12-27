import java.sql.SQLOutput;
import java.util.Scanner;

public class Question44 {
    public static int[] deleteElement(int[] array){
        Scanner input = new Scanner(System.in);
        //get the delete element
        System.out.print("Enter the element which you want to delete: ");
        int deleteElem = input.nextInt();

        //find the number of times of delete element occur in array
        int elemOccurrences = Utility.arrayOccurrences(array,deleteElem);

        //create a new array
        int[] newArray = new int[array.length-elemOccurrences];

        int j=0;
        for (int i : array){
            if (i == deleteElem) {
                continue;
            }
            newArray[j]=i;
            j++;
        }
        return newArray;
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of array delete a element from a array: ");
        // in this question we use Utility getArrayFromUser() method for getting array from user
        int[] array = Utility.getArrayFromUser();

        //delete a element from array
        int[] newArray = deleteElement(array);

        // print new array
        Utility.printArray(newArray);


    }
}
