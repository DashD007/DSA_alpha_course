public class lecture_89 {
    public static int BinarySearch(int arr[] ,int key){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid]>key){ // left
                end = mid-1;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,9,10,12};
        int index = BinarySearch(arr,9);
        System.out.println("index is at: "+ index);
    }
}
