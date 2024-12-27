public class Question46 {
    public static boolean isPalindromeArray(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] != array[array.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of Palindrome array ");
        // in this question we use Utility getArrayFromUser() method for getting array from user
        int[] array = Utility.getArrayFromUser();

        // check Palindrome
        System.out.println("Your array is: "+
                (isPalindromeArray(array) ? "Palindrome" : "Not Palindrome"));

    }
}
