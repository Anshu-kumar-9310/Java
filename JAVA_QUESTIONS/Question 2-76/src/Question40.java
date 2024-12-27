import java.util.Scanner;

public class Question40 {
    public static void sumAndAverage(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum/ array.length;

        System.out.printf("Sum of array is: %d and Average of array is: %d",sum,avg);
    }

    public static int[] insertElement(int[] array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Your "+(i+1)+" Element: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.print("Element in array is: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of array where sum and average: ");
        System.out.print("Enter the length of array: ");
        int arrayLength = input.nextInt();
        int[] anshu = new int[arrayLength];


        // for inserting element in array
        int[] array = insertElement(anshu);
        //print array
        printArray(array);
        // for sum and Average
        sumAndAverage(array);

    }
}
