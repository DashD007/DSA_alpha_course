import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class lecture_107 {
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void PrintArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // in this we will learn about the inbuilt sorting method of java and the collections reverse function to get the reverse order arr
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        PrintArr(arr);
        Integer arr_1[]= {8,3,1,5,2};
        Arrays.sort(arr_1, Collections.reverseOrder());
        PrintArr(arr_1);
    }

}
