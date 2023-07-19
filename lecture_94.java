import java.util.*;
public class lecture_94 {
    public static void max_sum_subarray(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                int curr_sum = 0;
                for(int k=i;k<=j;k++){
                   curr_sum += arr[k];
                }
                max_sum = Math.max(curr_sum, max_sum);
            }
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        // in this we will find the maximum sum of subarray
        int arr[] = {1,-2,6,-1,3};
        max_sum_subarray(arr);
    }
}
