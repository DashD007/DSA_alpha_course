public class lecture_183 {
    public static int PrintFib(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            int fib_n = PrintFib(n-1)+PrintFib(n-2);
            return fib_n;
        }
    }
    public static void main(String[] args) {
        // in this lecture we will print the nth fibonacci number..
        // 0 1 1 2 3 5 8 13 21...
        System.out.println(PrintFib(5));
    }
}
