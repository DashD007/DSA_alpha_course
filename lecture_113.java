import java.util.Scanner;
public class lecture_113 {
    public static boolean Search(int arr[][] , int key){
        // this function is to find the index of an element..
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==key){
                    System.out.println("The "+key+" is at index "+ i+" "+j);
                    return true;
                }
            }
        }
        return false;
    }

    public static int largest(int arr[][]){
        // this function is used to find the largest element in a matrix;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                max = Math.max(arr[i][j],max);
            }
        }
        return max;
    }

    public static int smallest(int arr[][]){
        //this function is used to find the smallest element in a matrix
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                min = Math.min(arr[i][j],min);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //in this we will learn about creation of 2d arrays;
        //creating a 2D arrays;
        int arr[][]= new int[3][3];  // size 3x3
        int n = arr.length;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        //input the elements;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //output the elements;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        Search(arr,5);
        System.out.println(largest(arr));
        System.out.println(smallest(arr));

    }
}
