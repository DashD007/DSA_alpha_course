public class lecture_93_a {
    public static void Sum_subarray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                ts++;
                System.out.print(sum+" ");
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("total subarray " +ts);
    }
    public static void main(String[] args) {
        // in this we will calculate the sum of subarrays
        int arr[] = {2,4,6,8,10};
        Sum_subarray(arr);
    }
}
