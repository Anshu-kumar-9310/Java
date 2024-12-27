public class Question47 {

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        arr1 = Utility.sortedArrayInAscOrder(arr1);
        arr2 = Utility.sortedArrayInAscOrder(arr2);
        int[] newArray = new int[arr1.length+ arr2.length];

        // i for arr1, j for arr2 and k for newArray
        int i=0, j=0, k=0;

        // WHILE LOOP TAB TAK CHALTA RAHEGA JAB TAK DONO ARRAY KI LENGTH FINISH NHI HO JATI
        while (i < arr1.length || j < arr2.length){
            // IF RETURNS TRUE WHEN:
            // AGAR arr2 ARRAY PURA FINISH HO GYA HO
            // YA PHIR
            // arr1 KI LENGTH ABHI BAKI HAI AND arr1 KI VALUE CHOTI HAI arr2 KI VALUE SE
            if(j== arr2.length || (i< arr1.length && arr1[i] < arr2[j])){
                newArray[k] = arr1[i];
                k++;
                i++;
            }else{
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of merge two sorted array.");
         //in this question we use Utility getArrayFromUser() method for getting array from user
        System.out.println("Enter your First Array");
        int[] array1 = Utility.getArrayFromUser();

        System.out.println("Enter your Second Array");
        int[] array2 = Utility.getArrayFromUser();

        int[] mergerArray = mergeTwoSortedArray(array1,array2);
        System.out.println("Merge of two sorted array is: ");

        // print
        Utility.printArray(mergerArray);

    }
}
