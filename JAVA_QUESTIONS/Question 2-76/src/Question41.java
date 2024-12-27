import java.util.Scanner;

public class Question41 {
    public static int[] getArrayFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int arrayLength = input.nextInt();
        int[] array= new int[arrayLength];

        // insert element in array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Your "+(i+1)+" Element: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void arrayOccurrences(int[] array){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which element you want to find in array: ");
        int element = input.nextInt();

        int times=0;
        for (int j : array) {
            if (j == element) {
                times++;
            }
        }
        System.out.println("Number of Occurrences is: "+times);
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of array where no. of Occurrences: ");

        int[] array = getArrayFromUser();

        arrayOccurrences(array);

    }
}
