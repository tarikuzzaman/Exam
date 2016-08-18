package math;

/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int length = array.length + 1;
        int trueSum = (length * (length + 1)) / 2;
        int arraySum = 0;
        for(int i = 0 ; i < array.length ; i++){
            arraySum = arraySum + array[i];
        }
        int missingNum = trueSum - arraySum;
        System.out.println("The missing number in the array is: "+missingNum);

    }
}
