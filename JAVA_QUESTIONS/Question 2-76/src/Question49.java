public class Question49 {

    public static int sum2dArray(int[][] Array2d){
        int sum =0;
        for (int i = 0; i < Array2d.length; i++) {
            for (int j = 0; j < Array2d[0].length; j++) {
                sum += Array2d[i][j];
            }
        }
        return sum;
    }
    public static float Avg2dArray(int[][] Array2d){
        float avg =0;
        int sum = sum2dArray(Array2d);
        avg =(float) sum/(Array2d.length*Array2d[0].length);
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of 2d array where sum and average is calculated.");
        // in this question we use Utility get2dArrayFromUser() method for getting array from user
        int[][] array2d = Utility.get2dArrayFromUser();

        //sum
        int sum = sum2dArray(array2d);
        float avg = Avg2dArray(array2d);

        System.out.printf("Sum of 2d Array is: %d And Average of 2d Array is: %f",sum,avg);
    }
}
