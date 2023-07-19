public class lecture_197 {
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Mergesort(int arr[], int si,int ei){
        //base
        if(si>= ei){
            return;
        }
        //kaam
        int mid = si +(ei-si)/2;
        //left side
        Mergesort(arr,si,mid);
        //rightside
        Mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//iterator for left side
        int j = mid+1; // iterator for right side
        int k = 0; // iterator for temp array;
        while(i<= mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copy temp to original array{
        for(k = 0,i=si;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        Mergesort(arr,0,arr.length-1);
        PrintArr(arr);
    }
}
