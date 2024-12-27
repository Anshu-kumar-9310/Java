public class Question45 {
    public static int[] ReverseArrayMethod1(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int space = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=space;
        }
        return array;
    }

    //second method is created a new array like Question 44

    public static void main(String[] args) {
        System.out.println("Welcome in the world of reverse array ");
        // in this question we use Utility getArrayFromUser() method for getting array from user
        int[] array = Utility.getArrayFromUser();

        //Reverse a array
        int[] newArray= ReverseArrayMethod1(array);

        //print
        Utility.printArray(newArray);

    }
}
