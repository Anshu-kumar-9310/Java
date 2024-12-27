public class Question43 {
    public static boolean checkSorted(int[] array){
        if (array.length<=0){
            return true;
        }
       int firstElement = array[0];
       for (int i : array){
           if (firstElement > i){
               return false;
           }
           firstElement = i;
       }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of array sorted : ");
        // in this we use Question41 getArrayFromUser() method for getting array from user
        int[] array = Question41.getArrayFromUser();

        //check sorted
        boolean result = checkSorted(array);
        System.out.println("Your array is: "+ (result ? "Sorted " : "Not Sorted")+" in Asc Order");

    }
}
