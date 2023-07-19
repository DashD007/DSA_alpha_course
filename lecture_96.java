public class lecture_96 {
    public static void Sum_of_subarray(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i=0;i<arr.length;i++){
            if(curr_sum+arr[i]>=0){
                curr_sum = curr_sum+arr[i];
            }
            else{
                curr_sum =0;
            }
            max = Math.max(max,curr_sum);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        //in this we will learn about finding of maximum sum of subarray using kadane's algo;
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        Sum_of_subarray(arr);
    }
}
