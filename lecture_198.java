public class lecture_198 {
    public static void PrintArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void QuickSort(int[] arr,int si,int ei){
        //base
        if(si >=ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        QuickSort(arr,si,pidx-1);
        QuickSort(arr,pidx+1,ei);
    }

    public static int partition(int[] arr,int si,int ei){
        int pivot = arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};
        QuickSort(arr,0,arr.length-1);
        PrintArr(arr);
    }
}
