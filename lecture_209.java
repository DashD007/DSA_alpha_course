public class lecture_209 {
    public static void ChangeArr(int arr[],int i,int value){
        //base case
        if(i==arr.length) {
            PrintArr(arr);
            return;
        }
        arr[i] = value;
        ChangeArr(arr,i+1,value+1); //function calling step;
        arr[i] = arr[i]-2; // backtracking
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        //in this lecture we will learn how to apply backtracking on array;
        int[] arr = new int[5];
        ChangeArr(arr,0,1);
        PrintArr(arr);
    }
}

//time complexity = O(n);
//space complexity = O(n);
