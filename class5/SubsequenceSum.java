package class5;

import java.lang.reflect.Array;

public class SubsequenceSum {

    public static void printSubsequenceSum(int arr[], int index, int sum) {
       
        if (index == arr.length) {
            System.out.println(sum);
            return;
        }

       
        printSubsequenceSum(arr, index + 1, sum + arr[index]);

       
        printSubsequenceSum(arr, index + 1, sum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        printSubsequenceSum(arr, 0, 0);
    }
}
