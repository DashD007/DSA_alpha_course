public class lecture_186 {
    public static int lastOccurence(int arr[],int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr,key,i-1);
    }
    public static void main(String[] args) {
        // in this lecture we will print the last occurence of an element in an array;
        int [] arr= {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr,5,8));
        int[] arr1 = {5, 5, 5, 5};
        System.out.println(lastOccurence(arr1,5,3));
    }
}
