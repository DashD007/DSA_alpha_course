public class lecture_180 {
    public static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        //in this lecture we will print the numbers in increasing order using recursion..
        // if n=5 ... 1 2 3 4 5
        printIncreasing(10);
    }
}
