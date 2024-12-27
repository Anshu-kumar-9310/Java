import java.util.Scanner;

public class Question39 {
    public static void RightHalfPyramid(int num){
        System.out.println("Right Half Pyramid: ");
        for (int i=1; i<= num; i++){
            for (int j =1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void ReverseRightHalfPyramid(int num){
        System.out.println("Reverse Right Half Pyramid: ");
        for (int i = num; i>0; i--){
            for (int j=1; i>=j; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void LeftHalfPyramid(int num){
        System.out.println("Left Half Pyramid");
        for (int i=1;i<=num;i++){
            //loop for spaces
            for (int j=1; j<=(num-i);j++){
                System.out.print("  ");
            }
            //loop for stars
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Patterns");
        System.out.print("Enter how many star you want to print: ");
        int num = input.nextInt();
        RightHalfPyramid(num);
        ReverseRightHalfPyramid(num);
        LeftHalfPyramid(num);

    }
}
