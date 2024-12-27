import java.util.Scanner;

public class Question33 {
    public static int hcf(int num1, int num2){
        int i =2;
        int hcf = 1;
        while (i<=num1){
            if(num1%i==0 && num2%i==0){
                hcf =i;
            }
            i++;
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of HCF");
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int result = hcf(num1,num2);

        System.out.println("HCF of Numbers is: "+result);
    }
}
