public class leet_code {
    public static int[] plusOne(int[] arr){
        int n = arr.length;
        if(arr[n-1]!=9){
            arr[n-1] += 1;
            return arr;
        }
        else{
            int[] arr1 = new int[n+1];
            int i = arr1.length-1;
            while(i>0){
                int last = arr[i];
                if(last>9){
                    arr[i]=0;
                    arr[i-1] +=1;
                }
                i--;
            }
            return arr1;
        }
    }
    public static void PrintArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
//        int[] arr ={9,9};
//        int[] arr1 = plusOne(arr);
//        PrintArr(arr1);
        for(int i=0;i<50;i=i+5){
            for(int j=i+1;j<=5;j++){
                System.out.println(i+" "+j);
            }
        }

    }
}
