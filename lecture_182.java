public class lecture_182 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum = n+sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        // in this lecture we will print the sum of first n natural number
        System.out.println(sum(5));
    }
}
