public class Question42 {
    public static void max(int[] array){
        if (array.length<=0){
            System.out.println("Maximum number in array is: "+Integer.MAX_VALUE);
            return;
        }
        int minimumNumber = Integer.MIN_VALUE;

        for (int j : array) {
            if (j > minimumNumber) {
                minimumNumber = j;
            }
        }
        System.out.println("Maximum number in array is: "+minimumNumber);
    }
    public static void min(int[] array){
        if (array.length<=0){
            System.out.println("Minimum number in array is: "+Integer.MIN_VALUE);
            return;
        }
        int minimumNumber = array[0]; //6 -98 65
        for (int j : array){
            if (minimumNumber>j){
                minimumNumber = j;
            }
        }
        System.out.println("Minimum number in array is: "+minimumNumber);
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of array where Maximum and Minimum: ");
        // in this we use Question41 getArrayFromUser() method for getting array from user
        int[] array = Question41.getArrayFromUser();

        //maximum number in array
        max(array);
        //minimum number in array
        min(array);

    }
}
