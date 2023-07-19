public class lecture_88 {
    //finding largest number in array
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        int index =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The index is "+ index);
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {89,4,10,56,2,12};
        int max = largest(arr);
        System.out.println(max);
    }
}
