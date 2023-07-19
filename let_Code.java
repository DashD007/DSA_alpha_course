public class let_Code {
    public static int CountDigits(long n){
        if(n==0) return 1;
        int count=0;
        while(n>0){
            n /=10;
            count++;
        }
        return count;
    }
    public static int[] plusOne(int[] arr){
        long total =0;
        for(int i=0;i<arr.length;i++){
            total *= 10;
            total += arr[i];
        }
        total++;
        System.out.println(total);
        int count = CountDigits(total);
        int[] arr1 = new int[count];
        int i = count-1;
        while(total!=0){
            long last = total%10;
            arr1[i] = (int)last;
            i--;
            total = total/10;
        }
        return arr1;
    }
    public static void PrintArr(int[] arr1){
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        int[] arr = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] arr1 = plusOne(arr);
        PrintArr(arr1);

        System.out.println(CountDigits(12345));
    }
}
