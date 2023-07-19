public class lecture_181 {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int mul = n *fact(n-1);
        return mul;
    }
    public static void main(String[] args) {
        // in this lecture, we will gonna print the factorial of number n
        // 5 --> 5*4*3*2*1
        System.out.println(fact(5));
    }
}
