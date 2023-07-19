import java.util.*;
public class practice_1 {
    public static void palindromic(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=n-i+1;j>=1;j--){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void findoccurence(int arr[],int key,int n){
        if(n<0){
            return;
        }
        if(arr[n]==key){
            System.out.print(n+" ");
        }
        findoccurence(arr,key,n-1);
    }
    static String[] digits = {"Zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void integerToString(int n){
        if(n==0){
            return;
        }
        int last = n%10;
        integerToString(n/10);
        System.out.print(digits[last]+" ");
    }
    public static int lengthofString(String str){
        if(str.length()==0){
            return 0;
        }
        return lengthofString(str.substring(1))+1;
    }

    public static int countSubStr(String str, int i, int j, int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res = countSubStr(str,i+1,j,n-1)+ countSubStr(str,i,j-1,n-1)- countSubStr(str,i+1,j-1,n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
//        palindromic(5);
//        int x = 4;
//        int y = 5;
//        System.out.println("before Swapping :"+x+" "+y);
//        //swapping
//        x = x+y;
//        y = x-y;
//        x = x-y;
//        System.out.println("After Swapping :"+x+" "+y);
        int[] arr = {3,2,4,5,6,2,7,2,2};
        //findoccurence(arr,2,arr.length-1);
        //integerToString(2019);
        //System.out.println(lengthofString("abcdefghijklmnopqrst"));
        String str = "abcab";
        System.out.println(countSubStr(str,0,str.length()-1,str.length()));
    }

}
