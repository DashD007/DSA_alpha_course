public class lecture_201 {
    public static int Search(int[] arr,int tar,int si,int ei){
        //base case
        if(si>ei){
            return -1;
        }
        int mid = si +(ei-si)/2;
        if(arr[mid]== tar){
            return mid;
        }

        //on line l1;
        if(arr[si]<= arr[mid]){
            //case a: left side of line l1;
            if(arr[si]<=tar && tar<= arr[mid]){
                return Search(arr,tar,si,mid-1);
            }
            //case b: right side of line l1;
            else{
                return Search(arr,tar,mid+1,ei);
            }
        }
        //on line l2;
        else {
            // case c: right side of line l2;
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid+1, ei);
            }
            // case D: left side of line l2;
            else {
                return Search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        // in this lecture we will learn to find the index of element in rotated sorted array;
        int [] arr= {4,5,6,7,0,1,2};
        int target = 0;
        int tarIndex = Search(arr,target,0,arr.length-1);
        System.out.println(tarIndex);
    }
}
