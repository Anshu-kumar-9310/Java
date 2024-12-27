import java.util.Scanner;

public class Question58 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world Switch calculator.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your Operation sign (+,-,*,/,%): ");
        String operation = input.next();

//        switch (operation){
//            case "+":
//                System.out.println("Addition of numbers is: "+(num1+num2));
//                break;
//            case "-":
//                System.out.println("Subtraction of numbers is: "+(num1-num2));
//                break;
//            case "*":
//                System.out.println("Multiplication of numbers is: "+(num1*num2));
//                break;
//            case "/":
//                System.out.println("Division of numbers is: "+(num1/num2));
//                break;
//            case "%":
//                System.out.println("Remainder of numbers is: "+(num1%num2));
//                break;
//            default:
//                System.out.println("Enter valid operation type.");
//        }


        // new Syntax
        switch (operation){
            case "+" -> System.out.println("Addition of numbers is: "+(num1+num2));
            case "-" -> System.out.println("Subtraction of numbers is: "+(num1-num2));
            case "/" -> System.out.println("Division of numbers is: "+(num1/num2));
            case "%" -> System.out.println("Remainder of numbers is: "+(num1%num2));
            case "*" -> System.out.println("Multiplication of numbers is: "+(num1*num2));
            default -> System.out.println("Enter valid operation type.");

        }

        // new Syntax
//        int result = switch (operation){
//            case "+" -> (num1+num2);
//            case "-" -> (num1-num2);
//            case "/" -> (num1/num2);
//            case "%" -> (num1%num2);
//            case "*" -> (num1*num2);
//            default -> -1;
//        };

//        System.out.println("Your result is: "+result);

    }
}
