import java.util.Scanner;

public class Question74 {
    public static void GuessingGame() {
        Scanner input = new Scanner(System.in);

        int ComNum = (int) Math.floor(Math.random() * 100) + 1;


        int userNum;
        do {
            System.out.print("Guess a number between 1-100: ");
            userNum = input.nextInt();

            if(ComNum > userNum){
                System.out.println("Guess Higher.");
            }else if (ComNum < userNum){
                System.out.println("Guess Lower");
            }
        } while (ComNum != userNum);

        System.out.println("You won the Match.");
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of number Guessing Game.");
        GuessingGame();
    }
}
