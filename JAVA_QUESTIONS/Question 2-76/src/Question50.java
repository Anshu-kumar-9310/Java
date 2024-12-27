public class Question50 {
    public static int SumOfLeftDiagonal(int[][] Array2d){
        int sum =0;
        for (int i = 0; i < Array2d.length; i++) {
            sum += Array2d[i][i];
        }
        return sum;
    }

    public static int SumOfRightDiagonal(int[][] Array2d){
        int sum =0;
        for (int i = 0; i < Array2d.length; i++) {
            sum += Array2d[i][Array2d.length-i-1];
        }
        return sum;
    }

    public static void finalSumOfDiagonal(int[][] Array2d){
        int sum =0;
        int leftSum =SumOfLeftDiagonal(Array2d);
        int rightSum = SumOfRightDiagonal(Array2d);

        if(Array2d.length%2 !=0){
            int centerElement = Array2d.length/2;
            sum = leftSum+rightSum-Array2d[centerElement][centerElement];

            System.out.printf("Sum of Diagonal of 2d Array(%d X %d) is: %d",
                    Array2d.length,Array2d.length,sum);
        }else {
            sum = leftSum +rightSum;
            System.out.printf("Sum of Diagonal of 2d Array(%d X %d) is: %d",
                    Array2d.length,Array2d.length,sum);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of 2d Symmetric array where sum of Diagonal calculated.");
        System.out.println("example of Symmetric array is 2*2, 4*4,even*even, odd*odd.");
        // in this question we use Utility get2dArrayFromUser() method for getting array from user
        int[][] array2d = Utility.get2dArrayFromUser();

        // Sum of Diagonal is
        finalSumOfDiagonal(array2d);
    }

//            3*3(repeat)
//
//            1	2	3
//            5	5	7
//            6	6	8

//            5*5(repeat)
//            1	2	3	8	8
//            5	5	7	7	7
//            6	6	8	6	6
//            5	5	7	6	6
//            6	6	8	5	4




//            4*4(non repeat)
//
//            8	8	8	9
//            9	6	4	3
//            3	4	5	7
//            3	4	5	6

//            2*2
//            1	8
//            8	7


//            (not allowed)
//            4*3
//            3	3	4
//            5	4	3
//            7	8	6
//            7	9	7
}
