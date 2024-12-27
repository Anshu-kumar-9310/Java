package Question82;

import static Question82.SortArrayInAsc.sortArray;

public class Arrayoperations {
    private int[] numbers;

    // make numbers2 static because static inner class can only access static members
    // and methods
    private static int[] numbers2 = new int[]{1,3,4,2,4};

    public Arrayoperations(int[] numbers) {
        this.numbers = numbers;
    }

    // non-static inner class
    public class Statistics {
        double mean(){
            double sum = 0;
            for (int i : numbers){
                sum += i;
            }
            return sum/numbers.length;
        }
        double median(){
            // length of array
            int length = numbers.length;
            //first sort array in ASC order
            int[] sortedArray= sortArray(numbers,length);

            double median = 0;
            if (sortedArray.length %2 == 0){
                // Even length: Median is the average of the two middle elements
                median = (double) (sortedArray[(sortedArray.length - 1) / 2] + sortedArray[sortedArray.length / 2]) / 2;
            }else {
                // Odd length: Median is the middle element
                median = numbers[sortedArray.length / 2];
            }

            return median;
        }

    }

    //static inner class
    public static class Anshu {
        // pending
        double median(){
            // length of array
            int lengthOfStaticArray = numbers2.length;
            //first sort array in ASC order
            int[] sortedStaticArray= sortArray(numbers2,lengthOfStaticArray);

            double staticMedian =0;
            if(lengthOfStaticArray %2 ==0){
                // Even length: Median is the average of the two middle elements
                staticMedian = (double) (sortedStaticArray[(lengthOfStaticArray-1) /2] + sortedStaticArray[(lengthOfStaticArray/2)]) / 2;
            }else{
                // Odd length: Median is the middle element
                staticMedian = sortedStaticArray[lengthOfStaticArray/2];
            }


            return staticMedian;
        }
        double mean(){
            double sum = 0;
            for (int i : numbers2){
                sum += i;
            }
            return sum/numbers2.length;
        }
    }
}

//Explanation of to find Median:
//: Arrays.sort(numbers) arranges the elements in ascending order.
//Odd Length: For arrays with an odd number of elements, the middle element is at index n / 2.
//Even Length: For arrays with an even number of elements, the median is calculated as the average of the two middle elements: (n-1)/2 and n/2.