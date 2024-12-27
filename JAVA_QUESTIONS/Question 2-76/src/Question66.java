import java.util.Scanner;

public class Question66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Sum Of Positive Number: ");
        // in this question we use Utility getArrayFromUser() method for getting array from user
        int[] array = Utility.getArrayFromUser();

        int sum =0;
        if(array.length<0){
            System.out.printf("Sum of all positive element is: %d",sum);
        }else{
            for (int i : array){
                if(i < 0){
                    continue;
                }
                sum += i;
            }
            System.out.printf("Sum of all positive element is %d",sum);
        }

    }
}
