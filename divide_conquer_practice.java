public class divide_conquer_practice {
    public static void PrintArr(String[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(String[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+ (ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(String[] arr,int si ,int mid,int ei){
        String[] temp = new String[arr.length];
        int i =si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])>0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        for(int z=0;z<arr.length;z++){
            arr[z] = temp[z];
        }
        PrintArr(arr);
    }
    public static void main(String[] args) {
        String[] arr = {"sun","earth","mars","mercury"};
        mergeSort(arr,0, arr.length-1);
    }
}
