import java.util.Scanner;

public class Question32 {
    public static int lcm(int num1, int num2){
        int i = 1;
        while(i <= num1){
            if((num2*i) % num1 ==0){
                return num2*i;
            }
            i++;
        }
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of LCM");
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int result = lcm(num1,num2);

        System.out.println("LCM of Numbers is: "+result);
    }
}
