public class gfg_practice {
    public static void mergeSort(int[] arr, int l,int r){
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr,int l,int mid,int r){
        int[] temp = new int[r-l+1];
        int i = l;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
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
        while(j<=r){
            temp[k++] = arr[j++];
        }
        for(k=0,i=l;k<= temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        mergeSort(arr,l,r);
        return arr[k];
    }

    public static int minjumps(int arr[]){
        int n = arr.length;
        if(n==1||n==0) return n;

        int ans=1;
        int jump=arr[0];
        for(int i=0;i<n;i+=jump){
            if(jump==0) return -1;
            if(jump>n) return ans;
            for(int j=i;j<=jump;j++){
                if(jump<arr[j]){
                    jump = Math.max(jump,arr[j]);
                    i=j;
                    n=n-j;
                }
            }
            ans++;
        }
        return ans;
    }

    public static int countsq(int arr[]){
        int n = arr.length;
        int count =0;
        for(int i=0;i<n;i++) {
            if (arr[i] > 0) {
                int sqrt = (int) Math.sqrt(arr[i]);
                if (sqrt * sqrt == arr[i]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        int[] arr={7,10,4,3,20,15};
//        System.out.println(kthSmallest(arr,0,arr.length-1,3));
        //int[] arr= {1, 4, 3, 2, 6, 7};
        //System.out.println(minjumps(arr));
        int[] arr ={-9,11,12,19,14,-10,14,-9,13};
        int[] arr1 = {10,-15,-16,4,25,20,-20,12};
        System.out.println(countsq(arr));
        System.out.println(countsq(arr1));
    }
}
