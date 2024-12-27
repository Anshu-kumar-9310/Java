import java.util.Scanner;

public class Question48 {
    public static void SearchIn2dArray(int[][] Array2d){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which element you want to search: ");
        int searchElem = input.nextInt();

        int times = 0;
        for (int i = 0; i < Array2d.length; i++) {
            for (int j = 0; j < Array2d[0].length; j++) {
                if (searchElem == Array2d[i][j]) {
                    times++;
                }
            }
        }

        System.out.printf("Your Element is present in Array is %d times",times);
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of 2d search array");
        // in this question we use Utility get2dArrayFromUser() method for getting array from user
        int[][] array2d = Utility.get2dArrayFromUser();

        //search in 2d Array
        SearchIn2dArray(array2d);


    }
}
