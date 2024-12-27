import java.util.Scanner;

public class Utility {
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

    public static int[] sortedArrayInAscOrder(int[] array){
        int length = array.length;

        for (int i = 0; i < length-1; i++) {

            for (int j = 0; j < length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] sortedArrayInDscOrder(int[] array){
        int length = array.length;

        for (int i = 0; i < length-1; i++) {

            for (int j = 0; j < length-i-1; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
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
    public static int arrayOccurrences(int[] array, int elem){
        int times=0;
        for (int j : array) {
            if (j == elem) {
                times++;
            }
        }
        return times;
    }

    public static int[][] get2dArrayFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of rows: "); //if you give 4
        int rows = input.nextInt();
        System.out.print("Enter the no. of cols: "); // and 5
        int cols = input.nextInt();

        int[][] Array2d = new int[rows][cols];
//        System.out.println(Array2d.length); //then you get 4
//        System.out.println(Array2d[0].length); // and 5

        for (int i = 0; i < Array2d.length; i++) {
            for (int j = 0; j < Array2d[0].length; j++) {
                System.out.printf("Enter element Rows "+(i+1) +" Columns "+(j+1)+" : ");
                Array2d[i][j] = input.nextInt();
            }
        }
        return Array2d;
    }

    public static void print2dArray(int[][] Array2d){
        System.out.println("Printing 2d Array:");
        for (int i = 0; i < Array2d.length; i++) {
            for (int j = 0; j < Array2d[0].length; j++) {
                System.out.print(Array2d[i][j] +" ");
            }
            System.out.println();
        }
    }
}
