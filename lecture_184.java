public class lecture_184 {
    public static Boolean isSorted(int arr[],int i){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        // in this lecture we will check if given array is sorted or not using recursion..
        int[] arr = {1,2,6,4,5};
        System.out.println(isSorted(arr,0));
    }
}
