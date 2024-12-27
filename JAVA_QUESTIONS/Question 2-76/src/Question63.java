public class Question63 {
    public static void main(String[] args) {
        System.out.println("Welcome in the world of array and Find Max elem using for-each loop: ");
        // in this question we use Utility getArrayFromUser() method for getting array from user
        int[] array = Utility.getArrayFromUser();

        if (array.length<=0){
            System.out.println("Maximum element in Array is: 0");
        }else{
            int maximumNumber = array[0];

            for (int i : array) {
                if(maximumNumber<i){
                    maximumNumber = i;
                }
            }
            System.out.println("Maximum element in Array is: "+maximumNumber);
        }

    }
}
