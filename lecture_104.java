public class lecture_104 {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){ // this loop will look for comparison
                if(arr[min]>arr[j]){
                    min =j;
                }
            }
            //swap;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] =temp;
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {5,4,3,1,2};
        SelectionSort(arr);
        PrintArr(arr);
    }
}
