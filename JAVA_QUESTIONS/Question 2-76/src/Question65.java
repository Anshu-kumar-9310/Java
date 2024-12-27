import java.util.Scanner;

public class Question65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of Exit on Exit: ");

        String keyword;
        while (true){
            System.out.print("Enter your keywords: ");
            keyword = input.nextLine();

            // Compare two strings value with Case Sensitive
//            if (keyword.equals("exit")){
//                break;
//            }

            // Compare two strings value without Case Sensitive
            // IF TRUE THEN RETURN 0
            if (keyword.compareToIgnoreCase("exit") == 0){
                break;
            }
        }
    }
}
