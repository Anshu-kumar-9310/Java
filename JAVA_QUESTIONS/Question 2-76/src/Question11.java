import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Triangle Area calculator");
        System.out.print("Enter Base of Triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = input.nextDouble();


        double Area = (base*height)/2;
        System.out.println("Perimeter of Rectangle ABCD is: "+Area);
    }
}
