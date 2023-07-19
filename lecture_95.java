public class lecture_95 {
    public static void Max_sum_prefix(int arr[]){
        int prefix[]= new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+ arr[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            int start = i;
            int curr_sum = 0;
            for(int j=i;j<prefix.length;j++){
                int end = j;
                if(start ==0){
                    curr_sum = prefix[end];
                }
                else{
                    curr_sum = prefix[end] - prefix[start-1];
                }
                System.out.println(curr_sum);
                if(curr_sum>max){
                    max = curr_sum;
                }
            }
        }
        System.out.println("");
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={ 1,-2,6,-1,3};
        Max_sum_prefix(arr);
    }
}
