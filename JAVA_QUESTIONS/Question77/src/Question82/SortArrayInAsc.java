package Question82;

public class SortArrayInAsc {
    public static int[] sortArray(int[] arr, int len){
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {

                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

//    public static void main(String[] args) {
//        int[] arr = new int[]{1,3,4,2,4};
//
//        int[] a = sortArray(arr);
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
//    }
}
