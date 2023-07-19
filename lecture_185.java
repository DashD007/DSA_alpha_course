public class lecture_185 {
    public static int firstOccurence(int arr[],int key,int i){

        if(arr[i]== key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static void main(String[] args) {
        // in this lecture we will print the index of first occurence of an element in an array...
        int[] arr= {8,3,6,9,2,10,2,4,5};
        System.out.println(firstOccurence(arr,5,0));
    }
}
